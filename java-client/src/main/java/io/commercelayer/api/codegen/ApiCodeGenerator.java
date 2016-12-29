package io.commercelayer.api.codegen;

import io.commercelayer.api.codegen.model.gen.ApiModelGen;
import io.commercelayer.api.codegen.schema.parser.ApiParserFactory;
import io.commercelayer.api.codegen.source.ApiModelWriter;

public final class ApiCodeGenerator {
	
	public static final String TEST_SCHEMA_PATH = "E:/cl-schema_swagger.json";
	

	private ApiCodeGenerator() {
		super();
	}
	
	public static void main(String[] args) {
		try {
//			new ApiModelWriter().writeCode(new ApiModelGen().createModel(ApiParserFactory.getSwaggerParserInstance().parseSchema(TEST_SCHEMA_PATH)));
			new ApiModelWriter().writeCode(new ApiModelGen().createModel(ApiParserFactory.getSwaggerParserInstance().parseSchema()));
		}
		catch (ApiCodegenException ace) {
			ace.printStackTrace();
		}
	}
	
}
