package io.commercelayer.api.codegen.schema.parser;

public final class ApiParserFactory {

	private ApiParserFactory() {
		
	}
	
	
	public static ApiParser getSwaggerParserInstance() {
		return new ApiSwaggerParser();
	}
	
}
