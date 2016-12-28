package io.commercelayer.api.codegen.source;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.codegen.ApiCodeGenerator;
import io.commercelayer.api.codegen.model.Model;
import io.commercelayer.api.codegen.model.Model.ClassGroup;
import io.commercelayer.api.codegen.model.ModelClass;
import io.commercelayer.api.codegen.model.gen.ApiModelGen;
import io.commercelayer.api.codegen.schema.parser.ApiParserFactory;
import io.commercelayer.api.util.IOUtils;
import io.commercelayer.api.util.LogUtils;

public class ApiModelWriter {
	
	private static Logger logger = LoggerFactory.getLogger(ApiModelWriter.class);

	public void writeCode(Model model) {
		
		logger.info("Writing Java code ...");
		
		for (Map.Entry<String, ClassGroup> cgEntry : model.getClassGroups().entrySet()) {
			
			try {
				initClassGroupDirectory(cgEntry.getKey());
			}
			catch (IOException ioe) {
				logger.error(LogUtils.printStackTrace(ioe));
				continue;
			}
			
			ClassGroup cg = model.getClassGroup(cgEntry.getKey());
			
			for (ModelClass mc : cg.getGroupClasses()) {
				try {
					writeClass(mc);
				}
				catch (IOException ioe) {
					logger.error(LogUtils.printStackTrace(ioe));
				}
			}
			
		}
		
		logger.info("Java classes created");
		
	}
	
	
	private void initClassGroupDirectory(String pkg) throws IOException {
		
		Path dirPath = Paths.get(IOUtils.packageToPath(pkg, "src/main/java"));
		File dir = dirPath.toFile();
		FileUtils.deleteDirectory(dir);
		FileUtils.forceMkdir(dir);
		
	}
	
	
	private void writeClass(ModelClass mc) throws IOException {
		try (
				FileWriter fw = new FileWriter(Paths.get(IOUtils.packageToPath(mc.getClassPackage(), "src/main/java"), mc.getName().concat(".java")).toFile());
				BufferedWriter bw = new BufferedWriter(fw);
			) {
				bw.write(mc.generate());
			}
	}
	
	
	public static void main(String[] args) {
		new ApiModelWriter().writeCode(new ApiModelGen().createModel(ApiParserFactory.getSwaggerParserInstance().parseSchema(ApiCodeGenerator.TEST_SCHEMA_PATH)));
	}
	
}
