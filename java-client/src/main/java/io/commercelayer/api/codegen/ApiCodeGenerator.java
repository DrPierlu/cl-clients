package io.commercelayer.api.codegen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.codegen.model.Model;
import io.commercelayer.api.codegen.model.gen.ApiModelGen;
import io.commercelayer.api.codegen.schema.Schema;
import io.commercelayer.api.codegen.schema.parser.ApiParser;
import io.commercelayer.api.codegen.schema.parser.ApiParserFactory;
import io.commercelayer.api.codegen.source.ApiModelWriter;
import io.commercelayer.api.util.LogUtils;

public final class ApiCodeGenerator {
	
	private static final Logger logger = LoggerFactory.getLogger(ApiCodeGenerator.class);
	

	private ApiCodeGenerator() {
		super();
	}

	public static void main(String[] args) {
		
		try {
		
			logger.info("******************** CommerceLayer Codegen Start ********************");
			
			ApiParser parser = ApiParserFactory.getSwaggerParserInstance();
			Schema schema = null;
			
			try {
				schema = parser.parseSchema();
			}
			catch (ApiCodegenException ace) {
				logger.error(ace.getMessage());
				logger.info("Online schema is not accessible, I will try to use the local one ...");
				schema = parser.parseSchema(CodegenConfig.getProperty("schema.parser.swagger.test"));
			}
			
			ApiModelGen modeller = new ApiModelGen();
			Model model = modeller.createModel(schema);
				
			ApiModelWriter writer = new ApiModelWriter();
			writer.writeCode(model);
			
			logger.error("Code Generation Successful");
			
		}
		catch (ApiCodegenException ace) {
			logger.error(LogUtils.printStackTrace(ace));
			logger.error("Code Generation Failed");
		}
		finally {
			logger.info("******************** CommerceLayer Codegen End ********************");
		}
		
	}

}
