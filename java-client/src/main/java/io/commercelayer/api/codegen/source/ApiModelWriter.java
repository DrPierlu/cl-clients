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

import io.commercelayer.api.codegen.model.Model;
import io.commercelayer.api.codegen.model.Model.ClassGroup;
import io.commercelayer.api.codegen.model.ModelClass;
import io.commercelayer.api.codegen.model.gen.ApiModelGen;
import io.commercelayer.api.codegen.schema.parser.ApiParser;
import io.commercelayer.api.codegen.schema.parser.ApiParserFactory;
import io.commercelayer.api.util.IOUtils;
import io.commercelayer.api.util.LogUtils;

public class ApiModelWriter {
	
	private static Logger logger = LoggerFactory.getLogger(ApiModelWriter.class);

	public void writeModel(Model model) {
		
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
		new ApiModelWriter().writeModel(new ApiModelGen().createModel(ApiParserFactory.getSwaggerParserInstance().parse(ApiParser.TEST_SCHEMA_PATH)));
	}
	
}