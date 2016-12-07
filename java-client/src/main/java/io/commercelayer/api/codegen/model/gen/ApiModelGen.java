package io.commercelayer.api.codegen.model.gen;

import java.lang.reflect.Modifier;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.lang3.text.WordUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.codegen.model.Constructor;
import io.commercelayer.api.codegen.model.Field;
import io.commercelayer.api.codegen.model.Method;
import io.commercelayer.api.codegen.model.Method.Param;
import io.commercelayer.api.codegen.model.Model;
import io.commercelayer.api.codegen.model.ModelClass;
import io.commercelayer.api.codegen.schema.Definition;
import io.commercelayer.api.codegen.schema.Operation;
import io.commercelayer.api.codegen.schema.Property;
import io.commercelayer.api.codegen.schema.Resource;
import io.commercelayer.api.codegen.schema.Schema;
import io.commercelayer.api.codegen.schema.parser.ApiParser;
import io.commercelayer.api.codegen.schema.parser.ApiParserFactory;
import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.security.ApiToken;
import io.commercelayer.api.util.ModelUtils;

public class ApiModelGen {
	
	private static final Logger logger = LoggerFactory.getLogger(ApiModelGen.class);
	
	public static final String PACKAGE_OBJECT 		= "io.commercelayer.api.codegen.output.object";
	public static final String PACKAGE_CALLER 		= "io.commercelayer.api.codegen.output.caller";
	public static final String PACKAGE_TEST 		= "io.commercelayer.api.codegen.output.test";
	public static final String PACKAGE_OPERATION 	= "io.commercelayer.api.codegen.output.operation";

	
	public Model createModel(Schema schema) {
		
		Model model = new Model();
		
		List<Definition> definitions = schema.getDefinitions();
		for (Definition def : definitions) {
			if (!model.addClass(createObjectClass(PACKAGE_OBJECT, def))) {
				logger.warn("Definition skipped: {}", def.getTitle());
			}
		}
		
		List<Resource> resources = schema.getResources();
		for (Resource res : resources) {
			if (!model.addClass(createCallerClass(PACKAGE_CALLER, res))) {
				logger.warn("Resource skipped: {}", res.getPath());
			}
		}
		
		return model;
		
	}
	
	
	private Class<?> decodePropertyTypeSimple(String p) {
		
		Class<?> type = null;
		
		switch(p) {
			case Property.Types.STRING: {
				type = String.class;
				break;
			}
			case Property.Types.INTEGER: {
				type = Integer.class;
				break;
			}
			case Property.Types.NUMBER: {
				type = Integer.class;
				break;
			}
			case Property.Types.OBJECT:
			default: type = Object.class;
		}
		
		return type;
		
	}
	
	
	private Class<?> decodePropertyType(Property p) {
		
		Class<?> type = null;
		
		switch(p.getType()) {
			case Property.Types.STRING: {
				type = String.class;
				if (p.getFormat() != null) {
					switch (p.getFormat()) {
						case Property.Formats.DATE_TIME: {
							type = LocalDateTime.class;
							break;
						}
						default: type = String.class; 
					}
				}
				break;
			}
			case Property.Types.INTEGER: {
				type = Integer.class;
				if (p.getFormat() != null) {
					switch (p.getFormat()) {
						case Property.Formats.INT32: {
							type = Integer.class;
							break;
						}
						default: type = Integer.class;
					}
				}
				break;
			}
			case Property.Types.NUMBER: {
				type = Integer.class;
				if (p.getFormat() != null) {
					switch (p.getFormat()) {
						case Property.Formats.FLOAT: {
							type = Float.class;
							break;
						}
						 default: type = Integer.class;
					}
				}
				break;
			}
			case Property.Types.ARRAY: {
				type = List.class;
				break;
			}
			case Property.Types.OBJECT:
			default: type = Object.class;
		}
		
		return type;
		
	}
	
	
	private ModelClass createObjectClass(String modelPackage, Definition def) {
		
		ModelClass mc = new ModelClass(modelPackage, def.getTitle(), Modifier.PUBLIC);
		mc.setComment(mc.getName());

		mc.setExtendedClass(ApiResource.class);
		
		mc.addConstructor(new Constructor(mc.getName(), Modifier.PUBLIC));
		mc.addConstructor(new Constructor(mc.getName(), Modifier.PUBLIC, new Constructor.Param(Long.class, "id")));
		
		for (Property p : def.getProperties()) {
			
			Field field = new Field(Modifier.PRIVATE, decodePropertyType(p), ModelUtils.toCamelCase(p.getName()));
			
			if (field.getType().equals(List.class)) {
				field.setListType(decodePropertyTypeSimple(p.getItemType()));
			}
			
			if (!mc.addField(field, true, true)) {
				logger.warn("Field skipped: {}.{}", def.getTitle(), field.getName());
			}
			
		}
		
		return mc;
		
	}
	
	
	
	
	private ModelClass createCallerClass(String modelPackage, Resource res) {
		
		ModelClass mc = new ModelClass();
		
		String path = res.getPath();
		
		String[] pathTokens = path.split("/");
		StringBuilder sb = new StringBuilder();
		for (String pt : pathTokens)
			if (!pt.contains("{") && !pt.contains("move_")) sb.append(WordUtils.capitalize(pt, '_').replaceAll("_", ""));
		
		if (res.isIdResource()) sb.append("Id");
		if (res.isMoveableResource()) sb.append("Move");
		
		String name = sb.append("Caller").toString();
		
		mc.setClassPackage(PACKAGE_CALLER);
		mc.setComment(name);
		mc.setName(name);
		mc.setModifier(Modifier.PUBLIC);
		
		mc.setExtendedClass(ApiCaller.class);
		
		Constructor c = new Constructor(name, Modifier.PUBLIC, new Constructor.Param(ApiToken.class, "apiToken"));
		c.setParent(true);
		mc.addConstructor(c);
		
//		Method rm = new Method(Modifier.PUBLIC);
//		rm.addAnnotation(Override.class);
//		rm.setName("getResourcePath");
//		rm.setReturnType(String.class);
//		rm.addBodyLine("return \"".concat(path).concat("\";"));
//		mc.addMethod(rm);
		
		
		mc.addImportItem(ApiRequest.class);
		
		for (Operation op : res.getOperations()) {
//			System.out.println("********** " + name + "->" + op.getId());
			mc.addMethod(buildOperationCall(path, op));
		}
		
		return mc;
		
	}
	
	
	private Method buildOperationCall(String path, Operation op) {
		
//		System.out.println("********** " + path + "->" + op.getId());
		
		Method m = new Method(Modifier.PUBLIC);
		
		m.setName(op.getId());
		m.addException(ApiException.class);
		
		switch(op.getMethod()) {
			case GET: {
				if (path.endsWith("{id}")) {
					m.addSignatureParam(new Param(Long.class, "id"));

				}
					
			}
			case POST: {
				
			}
			case PUT: {
				
			}
			case DELETE: {
				
			}
		}
		
		m.addBodyLine("final String path = \"path\";");
		m.addBodyLine("ApiRequest apiRequest = new ApiRequest(path, %s);", "null");
		
		
		return m;
		
	}
	
	
	private ModelClass createTestClass() {
		
		ModelClass mc = new ModelClass();
		
		return mc;
		
	}
	
	
	public static void main(String[] args) {
		
		Schema schema = ApiParserFactory.getSwaggerParserInstance().parse(ApiParser.TEST_SCHEMA_PATH);
		

		ApiModelGen apiGen = new ApiModelGen();
		
		Model model = apiGen.createModel(schema);
		
	}
	

//	public Address insertAddress(Address address) throws ApiException {
//		return (Address)insertItem(address);
//	}
//	
//	public Address updateAddress(Address address) throws ApiException {
//		return (Address)updateItem(address);
//	}
//	
//	public Address getAddress(Long id) throws ApiException {
//		return getItem(id, Address.class);
//	}
//	
//	public void deleteAddress(Long id) throws ApiException {
//		deleteItem(id);
//	}
//	
//	public ApiSearchResponse<Address> getAddressList(ApiSearchRequest searchRequest) throws ApiException {
//		return getItemList(searchRequest, Address.class);
//	}
//	


}
