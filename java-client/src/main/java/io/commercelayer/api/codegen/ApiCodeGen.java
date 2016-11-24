package io.commercelayer.api.codegen;

import java.util.List;

import io.commercelayer.api.swagger.Definition;
import io.commercelayer.api.swagger.Schema;

public class ApiCodeGen {

	public void codegen(Schema schema) {

		

	}
	
	public void generateDefinitions(Schema schema) {
		
		List<Definition> definitions = schema.getDefinitions();
		for (Definition def : definitions) {
			
			
			
		}
		
	}

	public static void main(String[] args) {
		
	}

}
