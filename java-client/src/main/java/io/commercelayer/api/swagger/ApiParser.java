package io.commercelayer.api.swagger;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;

import io.swagger.models.HttpMethod;
import io.swagger.models.Model;
import io.swagger.models.Path;
import io.swagger.models.Swagger;
import io.swagger.models.parameters.AbstractParameter;
import io.swagger.models.parameters.AbstractSerializableParameter;
import io.swagger.parser.SwaggerParser;

public class ApiParser {

	public Schema parse() {

		SwaggerParser parser = new SwaggerParser();

//		Swagger swagger = parser.read(ApiConfig.getProperty(Group.api, "service.url").concat("/swagger"));
		Swagger swagger = parser.read("E:/cl-schema_swagger.json");

		Schema schema = new Schema();
		
		Map<String, Model> definitions = swagger.getDefinitions();
		
		for (Map.Entry<String, Model> def : definitions.entrySet()) {
			
			Definition definition = new Definition();
			definition.setTitle(def.getKey());
			
			Map<String, io.swagger.models.properties.Property> properties = def.getValue().getProperties();
			for (Map.Entry<String, io.swagger.models.properties.Property> p : properties.entrySet()) {
				
//				System.out.println(prop.getKey() + ": " + ToStringBuilder.reflectionToString(prop.getValue(), ToStringStyle.MULTI_LINE_STYLE));
				
				Property prop = new Property();
				
				prop.setName(p.getKey());
				prop.setType(p.getValue().getType());
				prop.setFormat(p.getValue().getFormat());
				prop.setRequired(p.getValue().getRequired());
				prop.setReadonly(BooleanUtils.isTrue(p.getValue().getReadOnly()));
				
				definition.addProperty(prop);
				
			}
			
			schema.addDefinition(definition);
			
			
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
						
						
						operation.addParameter(parameter);
						
					}
					
					resource.addOperation(operation);
					
				}
				
				
				schema.addResource(resource);
				
			}
			
		}
		
		return schema;

	}
	
	
	public static String printOutDefinitions(Schema schema) {
		
		StringBuilder sb = new StringBuilder();
		
		for (Definition def : schema.getDefinitions()) {
			sb.append(def.getTitle()).append('\n');
			for (Property p : def.getProperties()) {
				sb.append("\t[")
					.append(p.getName()).append(", ")
					.append(p.getType()).append(", ")
					.append(p.getFormat()).append(", ")
					.append(p.isRequired()? "required" : "optional").append(", ")
					.append(p.isReadonly()? "readonly" : "writeable")
				.append("]\n");
			}
		}
		
		return sb.toString();
		
	}
	
	public static String printOutOperations(Schema schema) {
		
		StringBuilder sb = new StringBuilder();
		
		for (Resource res : schema.getResources()) {
			sb.append(res.getPath()).append('\n');
			for (Operation op : res.getOperations()) {
				sb.append("\t[").append(op.getMethod()).append("] ").append(op.getId()).append('\n');
				for (Parameter p : op.getParameters()) {
					sb.append("\t\t[")
						.append(p.getName()).append(", ")
						.append(p.getType()).append(", ")
						.append(p.getInputType()).append(", ")
						.append(p.getFormat()).append(", ")
						.append(p.getPattern()).append(", ")
						.append(p.isRequired()? "required" : "optional").append(", ")
						.append(p.getDescription())
					.append("]\n");
				}
			}
		}
		
		return sb.toString();
		
	}

	public static void main(String[] args) {
		Schema schema = new ApiParser().parse();
		System.out.println(printOutDefinitions(schema));
		System.out.println(printOutOperations(schema));
	}
	
}
