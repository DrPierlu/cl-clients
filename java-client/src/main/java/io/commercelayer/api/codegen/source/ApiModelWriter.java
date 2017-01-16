package io.commercelayer.api.codegen.source;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.codegen.ApiCodegenException;
import io.commercelayer.api.codegen.model.Model;
import io.commercelayer.api.codegen.model.Model.ClassGroup;
import io.commercelayer.api.codegen.model.ModelClass;
import io.commercelayer.api.util.IOUtils;
import io.commercelayer.api.util.LogUtils;

public class ApiModelWriter {

	private static Logger logger = LoggerFactory.getLogger(ApiModelWriter.class);

	public void writeCode(Model model) throws ApiCodegenException {
		writeCode(model, true);
	}
	
	public void writeCode(Model model, boolean initPackage) throws ApiCodegenException {

		logger.info("Creating Java code ...");

		for (Map.Entry<String, ClassGroup> cgEntry : model.getClassGroups().entrySet()) {

			final String classGroupKey = cgEntry.getKey();
			ClassGroup cg = model.getClassGroup(classGroupKey);

			if (initPackage)
			try {
				logger.info("Initializing package ... [{}]", classGroupKey);
				initClassGroupDirectory(classGroupKey, cg.getSourceDirectory());
			} catch (IOException ioe) {
				logger.error(LogUtils.printStackTrace(ioe));
				continue;
			}

			logger.info("Writing classes ... [{}]", classGroupKey);
			for (ModelClass mc : cg.getGroupClasses()) {
				try {
					writeClass(mc, cg.getSourceDirectory());
				} catch (IOException ioe) {
					logger.error(LogUtils.printStackTrace(ioe));
				}
			}

		}

		logger.info("Java classes created");

	}

	private void initClassGroupDirectory(String pkg, String srcDir) throws IOException {

		Path dirPath = Paths.get(IOUtils.packageToPath(pkg, srcDir));
		if (Files.notExists(dirPath)) Files.createDirectory(dirPath);

		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath)) {
			for (Path entry : stream) {
				if (Files.isRegularFile(entry)) Files.delete(entry);
			}
		}

	}

	private void writeClass(ModelClass mc, String srcDir) throws IOException {
		
		String pkg = IOUtils.packageToPath(mc.getClassPackage(), srcDir);
		String file = String.format("%s.java", mc.getName());
		OpenOption[] oo = { StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING };
		
		try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(pkg, file), oo)) {
			bw.write(mc.generate());
		}
		
	}

}
