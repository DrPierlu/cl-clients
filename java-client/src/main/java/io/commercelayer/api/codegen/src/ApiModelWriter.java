package io.commercelayer.api.codegen.src;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;

import io.commercelayer.api.codegen.model.Model;
import io.commercelayer.api.codegen.model.Model.ClassGroup;
import io.commercelayer.api.codegen.model.ModelClass;
import io.commercelayer.api.codegen.model.gen.ApiModelGen;
import io.commercelayer.api.codegen.schema.parser.ApiParser;
import io.commercelayer.api.codegen.schema.parser.ApiParserFactory;
import io.commercelayer.api.util.IOUtils;

public class ApiModelWriter {

	public void writeModel(Model model) {
		
		ClassGroup cg = model.getClassGroup(ApiModelGen.PACKAGE_OBJECT);
		for (ModelClass mc : cg.getGroupClasses()) {
			if (mc.getName().equals("Address"))
			try {
				writeObjectClass(mc);
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	}
	
	
	private void writeObjectClass(ModelClass mc) throws IOException {
		
		try (
			FileWriter fw = new FileWriter(Paths.get(IOUtils.packageToPath(ApiModelGen.PACKAGE_OBJECT, "src/main/java"), mc.getName().concat(".java")).toFile());
			BufferedWriter bw = new BufferedWriter(fw);
		) {
			bw.write(mc.generate());
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new ApiModelWriter().writeModel(new ApiModelGen().createModel(ApiParserFactory.getSwaggerParserInstance().parse(ApiParser.TEST_SCHEMA_PATH)));
	}
	
}
