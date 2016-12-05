package io.commercelayer.api.codegen.schema.parser;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;

import io.commercelayer.api.codegen.schema.Definition;
import io.commercelayer.api.codegen.schema.Operation;
import io.commercelayer.api.codegen.schema.Parameter;
import io.commercelayer.api.codegen.schema.Property;
import io.commercelayer.api.codegen.schema.Resource;
import io.commercelayer.api.codegen.schema.Schema;
import io.swagger.models.HttpMethod;
import io.swagger.models.Model;
import io.swagger.models.Path;
import io.swagger.models.Swagger;
import io.swagger.models.parameters.AbstractParameter;
import io.swagger.models.parameters.AbstractSerializableParameter;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.parser.SwaggerParser;

public class ApiSwaggerParser extends ApiParser {
	
	public Schema parse(String schemaPath) {

		SwaggerParser parser = new SwaggerParser();

		Swagger swagger = parser.read(schemaPath);

		Schema schema = new Schema();
		
		// Definitions
		Map<String, Model> definitions = swagger.getDefinitions();
		
		for (Map.Entry<String, Model> def : definitions.entrySet()) {
			
			Definition definition = new Definition();
			definition.setTitle(def.getKey());
			
			Map<String, io.swagger.models.properties.Property> properties = def.getValue().getProperties();
			for (Map.Entry<String, io.swagger.models.properties.Property> p : properties.entrySet()) {
//				System.out.println(prop.getKey() + ": " + ToStringBuilder.reflectionToString(prop.getValue(), ToStringStyle.MULTI_LINE_STYLE));
				definition.addProperty(parseProperty(p.getKey(), p.getValue()));
			}
			
			schema.addDefinition(definition);
			
		}
			
		
		// Resources
		Map<String, Path> paths = swagger.getPaths();
		
		for (Map.Entry<String, Path> path : paths.entrySet()) {
			
			Resource resource = new Resource();
			
			resource.setPath(path.getKey());
			
			Map<HttpMethod, io.swagger.models.Operation> operations = path.getValue().getOperationMap();
			for (Map.Entry<HttpMethod, io.swagger.models.Operation> op : operations.entrySet()) {
				
				Operation operation = new Operation();
				
				operation.setId(op.getValue().getOperationId());
				operation.setMethod(op.getKey().name());
				
				List<io.swagger.models.parameters.Parameter> params = op.getValue().getParameters();
				
				for (io.swagger.models.parameters.Parameter param : params) {
					operation.addParameter(parseParameter(param));						
				}
				
				resource.addOperation(operation);
				
			}
			
			
			schema.addResource(resource);
			
		}
			
		
		return schema;

	}
	
	
	private Property parseProperty(String propertyName, io.swagger.models.properties.Property p) {
		
		Property prop = new Property();
		
		prop.setName(propertyName);
		prop.setType(p.getType());
		prop.setFormat(p.getFormat());
		prop.setRequired(p.getRequired());
		prop.setReadonly(BooleanUtils.isTrue(p.getReadOnly()));
		prop.setDescription(p.getDescription());
		
		if (p instanceof ArrayProperty) {
			ArrayProperty ap = (ArrayProperty)p;
			prop.setItemType(ap.getItems().getType());
		}
		
		return prop;
		
	}
	
	
	private Parameter parseParameter(io.swagger.models.parameters.Parameter param) {
		
		Parameter parameter = new Parameter();
		
		parameter.setInputType(param.getIn());
		parameter.setDescription(param.getDescription());
		parameter.setRequired(param.getRequired());
		
		if (param instanceof AbstractParameter) {
			AbstractParameter ap = (AbstractParameter)param;
			parameter.setName(ap.getName());
			parameter.setRequired(ap.getRequired());
			parameter.setPattern(ap.getPattern());
		}
		
		if (ArrayUtils.contains(new String[]{"path",  "formData", "query"}, parameter.getInputType())) {
			AbstractSerializableParameter<?> asp = (AbstractSerializableParameter<?>)param;
			parameter.setFormat(asp.getFormat());
			parameter.setType(asp.getType());
		}
		
		return parameter;
		
	}
	

	public static void main(String[] args) {
		ApiParser parser = ApiParserFactory.getSwaggerParserInstance();
		Schema schema = parser.parse(TEST_SCHEMA_PATH);
		System.out.println(parser.printOutDefinitions(schema));
		System.out.println(parser.printOutOperations(schema));
	}
	
}
