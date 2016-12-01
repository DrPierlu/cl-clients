package io.commercelayer.api.codegen.model.gen;

import java.lang.reflect.Modifier;
import java.time.LocalDateTime;
import java.util.List;

import io.commercelayer.api.codegen.model.Field;
import io.commercelayer.api.codegen.model.Model;
import io.commercelayer.api.codegen.model.ModelClass;
import io.commercelayer.api.codegen.schema.Definition;
import io.commercelayer.api.codegen.schema.Property;
import io.commercelayer.api.codegen.schema.Resource;
import io.commercelayer.api.codegen.schema.Schema;
import io.commercelayer.api.codegen.schema.parser.ApiParser;
import io.commercelayer.api.codegen.schema.parser.ApiParserFactory;

public class ApiModelGen {
	
	private static final String PACKAGE_OBJECT 	= "io.commercelayer.api.codegen.output.object";
	private static final String PACKAGE_CALLER 	= "io.commercelayer.api.codegen.output.caller";
	private static final String PACKAGE_TEST 	= "io.commercelayer.api.codegen.output.test";

	public void codegen(Schema schema) {

		

	}
	
	public Model createModel(Schema schema) {
		
		Model model = new Model();
		
		List<Definition> definitions = schema.getDefinitions();
		for (Definition def : definitions) {
			model.addClass(createObjectClass(PACKAGE_OBJECT, def));
		}
		
		List<Resource> resources = schema.getResources();
		for (Resource res : resources) {
			
		}
		
		return model;
		
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
			default: type = Object.class;
		}
		
		return type;
		
	}
	
	
	private ModelClass createObjectClass(String modelPackage, Definition def) {
		
		ModelClass mc = new ModelClass(modelPackage, def.getTitle(), Modifier.PUBLIC);

		for (Property p : def.getProperties()) {
			mc.addField(new Field(Modifier.PRIVATE, decodePropertyType(p), p.getName()), true, true);
		}
		
		return mc;
		
	}
	
	private ModelClass createCallerClass(String modelPackage, Resource res) {
		
		ModelClass mc = new ModelClass();
		
		return mc;
		
	}
	
	private ModelClass createTestClass() {
		
		ModelClass mc = new ModelClass();
		
		return mc;
		
	}
	
	
	public static void main(String[] args) {
		
		Schema schema = ApiParserFactory.getSwaggerParserInstance().parse(ApiParser.TEST_SCHEMA_PATH);
		
		Model model = new ApiModelGen().createModel(schema);
		
		System.out.println("Model generated");
		
	}

}
