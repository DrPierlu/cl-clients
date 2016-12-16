package io.commercelayer.api.codegen;

import io.commercelayer.api.codegen.model.gen.ApiModelGen;
import io.commercelayer.api.codegen.schema.parser.ApiParserFactory;
import io.commercelayer.api.codegen.source.ApiModelWriter;

public final class ApiCodeGenerator {

	private ApiCodeGenerator() {
		super();
	}
	
	public static void main(String[] args) {
		new ApiModelWriter().writeCode(new ApiModelGen().createModel(ApiParserFactory.getSwaggerParserInstance().parseSchema()));
	}
	
}
