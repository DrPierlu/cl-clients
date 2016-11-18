package io.commercelayer.api.codegen;

import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;

public class ApiCodeGen {

	public void codegen() {
		
		SwaggerParser parser = new SwaggerParser();
		Swagger swagger = parser.read("http://");
		
		
		
	}
	
}
