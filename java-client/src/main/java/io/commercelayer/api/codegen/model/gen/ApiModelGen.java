package io.commercelayer.api.codegen.model.gen;

import java.lang.reflect.Modifier;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.codegen.ApiCodeGenerator;
import io.commercelayer.api.codegen.model.Constructor;
import io.commercelayer.api.codegen.model.CustomConstructor;
import io.commercelayer.api.codegen.model.Field;
import io.commercelayer.api.codegen.model.Method;
import io.commercelayer.api.codegen.model.Method.Param;
import io.commercelayer.api.codegen.model.Model;
import io.commercelayer.api.codegen.model.ModelClass;
import io.commercelayer.api.codegen.schema.Definition;
import io.commercelayer.api.codegen.schema.Operation;
import io.commercelayer.api.codegen.schema.Parameter;
import io.commercelayer.api.codegen.schema.Property;
import io.commercelayer.api.codegen.schema.Resource;
import io.commercelayer.api.codegen.schema.Schema;
import io.commercelayer.api.codegen.schema.parser.ApiParserFactory;
import io.commercelayer.api.codegen.source.ApiModelWriter;
import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.ApiOperation;
import io.commercelayer.api.operation.common.DeleteOperation;
import io.commercelayer.api.operation.common.GetIdOperation;
import io.commercelayer.api.operation.common.IdOperation;
import io.commercelayer.api.operation.common.MoveOperation;
import io.commercelayer.api.operation.common.PayloadOperation;
import io.commercelayer.api.operation.common.PostOperation;
import io.commercelayer.api.operation.common.PutOperation;
import io.commercelayer.api.operation.common.SearchOperation;
import io.commercelayer.api.util.ModelUtils;

public class ApiModelGen {

	private static final Logger logger = LoggerFactory.getLogger(ApiModelGen.class);

	private static final boolean GENERATE_OBJECT_CLASSES = true;
	private static final boolean GENERATE_OPERATION_CLASSES = true;
	private static final boolean GENERATE_TEST_CLASSES = true;

	public static final String PACKAGE_OBJECT = ApiModelWriter.class.getPackage().getName() + ".classes.object";
	public static final String PACKAGE_OPERATION = ApiModelWriter.class.getPackage().getName() + ".classes.operation";
	public static final String PACKAGE_TEST = ApiModelWriter.class.getPackage().getName() + ".classes.test";

	public Model createModel(Schema schema) {

		logger.info("Creating API Model ...");

		Model model = new Model();

		// Object classes
		logger.info("Generating model objects ...");

		if (GENERATE_OBJECT_CLASSES) {
			List<Definition> definitions = schema.getDefinitions();
			for (Definition def : definitions) {
				if (model.addClass(createObjectClass(PACKAGE_OBJECT, def)))
					logger.info("Definition: {}", def.getTitle());
				else
					logger.warn("Definition skipped: {}", def.getTitle());
			}
		}

		// Operation classes
		logger.info("Generating operations ...");

		if (GENERATE_OPERATION_CLASSES) {
			List<Resource> resources = schema.getResources();
			for (Resource res : resources) {
				for (Operation op : res.getOperations())
					if (model.addClass(createOperationClass(PACKAGE_OPERATION, res.getPath(), op)))
						logger.info("Resource: {}", res.getPath());
					else
						logger.warn("Resource skipped: {}", res.getPath());
			}
		}

		// Test classes
		if (GENERATE_TEST_CLASSES) {
			// TODO: JUnit test classes implementation
		}

		logger.info("Model generated");

		return model;

	}

	private Class<?> decodePropertyTypeSimple(String p) {

		Class<?> type = null;

		switch (p) {
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

		switch (p.getType()) {
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
		mc.addConstructor(new Constructor(mc.getName(), Modifier.PUBLIC, new Constructor.Param(Long.class, IdOperation.PARAM_ID, true)));

		for (Property p : def.getProperties()) {

			Field field = new Field(Modifier.PRIVATE, decodePropertyType(p), ModelUtils.toCamelCase(p.getName()));

			if (p.isReadonly() || field.getType().equals(Object.class))
				field.addAnnotation(JsonExclude.class);

			if (field.getType().equals(List.class)) {
				field.setListType(decodePropertyTypeSimple(p.getItemType()));
			}

			if (!mc.addField(field, true, true, true)) {
				// logger.warn("Field skipped: {}.{}", def.getTitle(), field.getName());
			}

		}

		createMethodEquals(mc);
		createMethodHashCode(mc);
		createMethodClone(mc);

		return mc;

	}

	private void createMethodEquals(final ModelClass mc) {

		Method m = new Method(Modifier.PUBLIC);

		m.addAnnotation(Override.class);

		m.setName("equals");
		m.setReturnType(boolean.class);
		m.addSignatureParam(new Method.Param(Object.class, "o"));
		mc.addImportItem(Objects.class);

		// Method Body
		m.addBodyLine(m.emptyLine());

		m.addBodyLine("if (this == o) return true;");
		m.addBodyLine("if ((o == null) || (getClass() != o.getClass())) return false;");
		m.addBodyLine(m.emptyLine());
		m.addBodyLine("%1$s x = (%1$s)o;", mc.getName());
		m.addBodyLine(m.emptyLine());
		m.addBodyLine("return super.equals(o)");

		for (Field f : mc.getFieldList()) {
			if (Modifier.isPrivate(f.getModifier()) && !Modifier.isStatic(f.getModifier()))
				m.addBodyLine("\t&& Objects.equals(this.%1$s, x.%1$s)", f.getName());
		}

		m.addBodyLine(";");
		m.addBodyLine(m.emptyLine());

		mc.addMethod(m);

	}

	private void createMethodHashCode(ModelClass mc) {

		Method m = new Method(Modifier.PUBLIC);

		m.addAnnotation(Override.class);

		m.setName("hashCode");
		m.setReturnType(int.class);
		mc.addImportItem(Objects.class);

		// Method Body
		m.addBodyLine(m.emptyLine());

		m.addBodyLine("return Objects.hash(");

		List<String> fieldList = new ArrayList<>();
		if (mc.getExtendedClass() != null)
		for (java.lang.reflect.Field f : mc.getExtendedClass().getDeclaredFields())
			if (Modifier.isPrivate(f.getModifiers()) && !Modifier.isStatic(f.getModifiers()))
				fieldList.add(f.getName());
		for (Field f : mc.getFieldList())
			if (Modifier.isPrivate(f.getModifier()) && !Modifier.isStatic(f.getModifier()))
				fieldList.add(f.getName());

		int i = 0;
		StringBuilder sb = new StringBuilder("\t");
		for (String f : fieldList) {
			sb.append(f);
			if (++i != fieldList.size()) sb.append(",");
			if ((i % 5) == 0) {
				m.addBodyLine(sb.toString());
				sb = new StringBuilder("\t");
			} else
				sb.append(' ');
		}
		m.addBodyLine(sb.toString());

		m.addBodyLine(");");

		m.addBodyLine(m.emptyLine());

		mc.addMethod(m);

	}

	private void createMethodClone(ModelClass mc) {

		Method m = new Method(Modifier.PUBLIC);

		m.addAnnotation(Override.class);

		m.setName("clone");
		m.setReturnTypeNew(mc.getName());

		// Method Body
		m.addBodyLine(m.emptyLine());
		m.addBodyLine("%1$s no = new %1$s();", mc.getName());
		m.addBodyLine(m.emptyLine());

		List<String> fieldList = new ArrayList<>();
		if (mc.getExtendedClass() != null)
			for (java.lang.reflect.Field f : mc.getExtendedClass().getDeclaredFields())
				if (Modifier.isPrivate(f.getModifiers()) && !Modifier.isStatic(f.getModifiers()))
					fieldList.add(f.getName());
		for (Field f : mc.getFieldList())
			if (Modifier.isPrivate(f.getModifier()) && !Modifier.isStatic(f.getModifier()))
				fieldList.add(f.getName());

		for (String f : fieldList) {
			m.addBodyLine("no.%1$s = this.%1$s;", f);
		}

		m.addBodyLine(m.emptyLine());
		m.addBodyLine("return no;");
		m.addBodyLine(m.emptyLine());

		mc.addMethod(m);

	}

	private ModelClass createOperationClass(String modelPackage, String path, Operation op) {

		ModelClass mc = new ModelClass(modelPackage, StringUtils.capitalize(op.getId()), Modifier.PUBLIC);
		mc.setComment(mc.getName());

		Class<? extends ApiOperation> extClass = null;

		switch (op.getMethod()) {
			case GET: {
				extClass = path.endsWith("{id}")? GetIdOperation.class : SearchOperation.class;
				break;	
			}
			case POST: {
				extClass = PostOperation.class;
				break;
			}
			case PUT: {
				extClass = path.contains("/move_")? MoveOperation.class : PutOperation.class;
				break;
			}
			case DELETE: {
				extClass = DeleteOperation.class;
				break;
			}
		}

		mc.setExtendedClass(extClass);
		
		
		final String operationPathField = "OPERATION_PATH";
		
		Field pf = new Field(Modifier.PUBLIC|Modifier.STATIC|Modifier.FINAL, String.class, operationPathField);
		pf.setInitialization(String.format("\"%s\"", path));
		mc.addField(pf);


		// Constructor
		CustomConstructor cc = new CustomConstructor();
		
		cc.setModifier(Modifier.PUBLIC);
		cc.setName(mc.getName());
		cc.addBodyLine("super(%s);", operationPathField);
		
		mc.addConstructor(cc);
		
		
		// IdOperation
		if (IdOperation.class.isAssignableFrom(mc.getExtendedClass())) {
			
			CustomConstructor ccid = new CustomConstructor();
			
			ccid.setModifier(Modifier.PUBLIC);
			ccid.setName(mc.getName());
			ccid.addSignatureParam(new Constructor.Param(Long.class, IdOperation.PARAM_ID));
			ccid.addBodyLine("super(%s, %s);", operationPathField, IdOperation.PARAM_ID);
			
			mc.addConstructor(ccid);
			
		}
		
		
		// PayloadOperation
		if (PayloadOperation.class.isAssignableFrom(mc.getExtendedClass()))
		if (!op.getParameters().isEmpty()) {
		
			StringBuilder sb = new StringBuilder();
			
			for (Parameter p : op.getParameters()) {
				if (sb.length() > 0) sb.append('\n');
				String name = ModelUtils.getObjectField(p.getName(), true);
				sb.append("addRequiredField(\"").append(name).append("\");");
			}
			
			mc.setInitBlock(sb.toString());
			
		}
		
		
		if (path.indexOf("{") != -1) {
			
			Pattern pattern = Pattern.compile("\\{[\\w_]+\\}");
			Matcher matcher = pattern.matcher(path);
			
            while (matcher.find()) {
            	
            	String param_ = matcher.group().replaceAll("[\\{\\}]", "");
            	String param = ModelUtils.toCamelCase(param_);
            	
            	if (ArrayUtils.contains(new String[]{IdOperation.PARAM_ID, MoveOperation.PARAM_POSITION}, param)) continue;
            	
            	
            	// Set Param
            	Method ms = new Method(Modifier.PUBLIC);
            	ms.setName("set".concat(StringUtils.capitalize(param)));
            	
            	ms.addSignatureParam(new Param(Object.class, param));
            	
            	ms.addBodyLine("addPathParam(\"%s\", %s);", param_, param);
            	
            	mc.addMethod(ms);
            	
            	
            	// Get Param
            	Method mg = new Method(Modifier.PUBLIC);
            	mg.setName("get".concat(StringUtils.capitalize(param)));
            	mg.setReturnType(Object.class);
            	
            	mg.addBodyLine("return getPathParam(\"%s\");", param_);
            	
            	mc.addMethod(mg);
            	
            }
			
		}
		

		return mc;

	}

	private ModelClass createTestClass() {

		ModelClass mc = new ModelClass();

		return mc;

	}

	public static void main(String[] args) {

		Schema schema = ApiParserFactory.getSwaggerParserInstance().parseSchema(ApiCodeGenerator.TEST_SCHEMA_PATH);

		ApiModelGen apiGen = new ApiModelGen();

		@SuppressWarnings("unused")
		Model model = apiGen.createModel(schema);

	}

}
