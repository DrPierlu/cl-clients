package io.commercelayer.api.codegen.schema.parser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.codegen.ApiCodegenException;
import io.commercelayer.api.codegen.schema.Definition;
import io.commercelayer.api.codegen.schema.Operation;
import io.commercelayer.api.codegen.schema.Parameter;
import io.commercelayer.api.codegen.schema.Property;
import io.commercelayer.api.codegen.schema.Resource;
import io.commercelayer.api.codegen.schema.Schema;
import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.config.ApiConfig.Group;

public abstract class ApiParser {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	
	protected abstract Schema parse(String schemaPath) throws ApiCodegenException;
	
	public Schema parseSchema() throws ApiCodegenException {
		return parse_(ApiConfig.getProperty(Group.api, "service.url").concat("/swagger"));
	}
	
	public Schema parseSchema(String schemaPath) throws ApiCodegenException {
		return parse_(schemaPath);
	}
	
	private Schema parse_(String schemaPath) throws ApiCodegenException {
		logger.info("Parsing Schema ... {}", schemaPath);
		logger.info("Executing Parser {}", getClass().getName());
		return parse(schemaPath);
	}
	
	
	public String printOutDefinitions(Schema schema) {
		
		StringBuilder sb = new StringBuilder();
		
		for (Definition def : schema.getDefinitions().values()) {
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
	
	public String printOutOperations(Schema schema) {
		
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
	
}
