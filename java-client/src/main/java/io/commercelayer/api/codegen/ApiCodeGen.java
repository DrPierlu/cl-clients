package io.commercelayer.api.codegen;

import java.util.List;

import io.commercelayer.api.swagger.Definition;
import io.commercelayer.api.swagger.Schema;

public class ApiCodeGen {

	public void codegen(Schema schema) {

		

	}
	
	public Model createModel(Schema schema) {
		
		Model model = new Model();
		
		List<Definition> definitions = schema.getDefinitions();
		for (Definition def : definitions) {
			
			ModelClass mc = new ModelClass("test.codegen.def", def.getTitle());
			
			model.addClass(mc);
			
		}
		
		return model;
		
	}
	
	public void generateCode(Model model) {
		
	}

	public static void main(String[] args) {
		
	}

}
