package io.commercelayer.api.codegen.model.gen;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.codegen.model.Method;
import io.commercelayer.api.codegen.model.gen.template.Placeholder;
import io.commercelayer.api.codegen.schema.Operation;
import io.commercelayer.api.codegen.schema.Parameter;
import io.commercelayer.api.codegen.schema.Property;
import io.commercelayer.api.codegen.schema.Property.Types;
import io.commercelayer.api.util.LogUtils;
import io.commercelayer.api.util.ModelUtils;

public final class CRUDUtils {

	private static final Logger logger = LoggerFactory.getLogger(CRUDUtils.class);


	private static Properties loadTemplateValues(Method method, String resource) {
		return loadTemplateValues(method.getName().concat(".properties"), resource);
	}


	private static Properties loadTemplateValues(String name, String resource) {

		if (!name.endsWith(".properties")) name += ".properties";

		Properties p = new Properties();

		try {
			p.load(CRUDUtils.class.getResourceAsStream("template/".concat(name)));
		}
		catch (IOException ioe) {
			logger.error("Error reading template values [{}]", name);
			logger.debug(LogUtils.printStackTrace(ioe));
		}

		if (!p.isEmpty() && (resource != null)) {

			Properties subp = new Properties();
			String res = StringUtils.uncapitalize(resource);

			for (Object o : p.keySet()) {
				String s = (String)o;
				if (s.startsWith(res)) subp.put(s.substring(res.length() + 1), p.getProperty(s));
			}

			p = subp;

		}

		return p;

	}


	private static List<String> replacePlaceholder(final List<String> lines, Placeholder placeholder) {

		List<String> newLines = new ArrayList<>(lines.size());

		for (String line : lines) {
			String newLine = line;
			if (newLine.contains(placeholder.getMarker())) newLine = newLine.replaceAll(Pattern.quote(placeholder.getMarker()), placeholder.getValue());
			newLines.add(newLine);
		}

		return newLines;

	}


	@SuppressWarnings("unused")
	private static List<String> loadTemplate(String name) {
		return loadTemplate(name, null);
	}


	private static List<String> loadTemplate(Method method, List<Placeholder> placeholders) {
		return loadTemplate(method.getName().concat(".tpl"), placeholders);
	}


	private static List<String> loadTemplate(String name, List<Placeholder> placeholders) {

		if (!name.endsWith(".tpl")) name += ".tpl";

		List<String> lines = null;

		try {
			lines = Files.readAllLines(Paths.get(CRUDUtils.class.getResource("template/".concat(name)).toURI()));
		}
		catch (IOException | URISyntaxException e) {
			logger.error("Error reading template [{}]", name);
			logger.debug(LogUtils.printStackTrace(e));
		}

		if (lines == null) lines = new ArrayList<>();
		else
			if (placeholders != null) for (Placeholder p : placeholders)
				lines = replacePlaceholder(lines, p);

		return lines;

	}
	
	
	private static String checkField(Parameter p, Operation op, Map<String, String> fieldsKo, boolean logEnabled) {
		
		String fieldName = ModelUtils.getObjectField(p.getName(), true);
		
		boolean fieldFound = false;
		for (Property x : op.getReference().getProperties())
			if (x.getName().equals(fieldName)) {
				fieldFound = true;
				if (x.getType().equals(Property.Types.OBJECT)) {
					fieldsKo.put(x.getName(), "FIELD TYPE OBJECT");
					if (logEnabled) logger.warn("{} -> field {} of type object", op.getName(), fieldName);
				}
				else
				if (!p.getType().equals(x.getType())) {
					fieldsKo.put(x.getName(), "FIELD TYPE MISMATCH");
					if (logEnabled) logger.warn("{} -> field {} of type {} instead of {}", op.getName(), fieldName, p.getType(), x.getType());
				}
				break;
			}

		if (!fieldFound) {
			fieldsKo.put(fieldName, "FIELD NOT FOUND");
			if (logEnabled) logger.warn("{} -> field {} not found in resource {}", op.getName(), fieldName, op.getReference().getTitle());
		}
		
		return fieldName;
		
	}
	

	static Method crudCreateMethodBody(Operation op, Method m) {

		List<Placeholder> phList = new ArrayList<>();

		phList.add(new Placeholder("PostOperation", op.getName()));
		phList.add(new Placeholder("ResourceType", op.getReference().getTitle()));

		StringBuilder plFields = new StringBuilder();
		StringBuilder assertions = new StringBuilder();

		if (!op.getParameters().isEmpty()) {

			Map<String, String> fields = new HashMap<>();
			Map<String, String> fieldsKo = new HashMap<>();

			Properties values = loadTemplateValues(m, op.getReference().getTitle());
			
			for (Parameter p : op.getParameters()) {

				if (!p.isFormDataParam()) continue;
				
				String n = checkField(p, op, fieldsKo, true);

				String val = null;
				switch (p.getType()) {
					case Types.INTEGER:
					case Types.NUMBER: { val = "randomValue()"; break; }
					case Types.BOOLEAN: { val = "true"; break; }
					case Types.STRING:
					default: { val = "name".equals(p.getName())? op.getReference().getTitle() : n; break; }
				}
				fields.put(n, String.format("\"%s\"", val));

			}

			for (Object o : values.keySet())
				fields.put((String)o, values.getProperty((String)o));

			for (Map.Entry<String, String> f : fields.entrySet()) {

				if (plFields.length() > 0) plFields.append('\n').append('\t');
				if (fieldsKo.containsKey(f.getKey())) plFields.append("// ").append(fieldsKo.get(f.getKey())).append(" -> ");
				plFields.append(String.format("res.set%s(%s);", StringUtils.capitalize(f.getKey()), f.getValue()));

				if (assertions.length() > 0) assertions.append('\n').append('\t');
				if (fieldsKo.containsKey(f.getKey())) assertions.append("// ").append(fieldsKo.get(f.getKey())).append(" -> ");
				assertions.append(String.format("Assert.assertNotNull(postRes.getResource().get%s());", StringUtils.capitalize(f.getKey())));

			}

		}
		else {
			plFields.append("/* No payload data */");
			assertions.append("/* No test assertions */");
		}

		phList.add(new Placeholder("PayloadData", plFields.toString()));
		phList.add(new Placeholder("TestAssertions", assertions.toString()));

		List<String> bodyLines = loadTemplate(m, phList);
		if (!bodyLines.get(0).trim().isEmpty()) bodyLines.add(0, m.emptyLine());
		if (!bodyLines.get(bodyLines.size() - 1).trim().isEmpty()) bodyLines.add(m.emptyLine());

		m.setBody(bodyLines);

		return m;

	}


	static Method crudReadMethodBody(Operation op, Method m) {

		List<Placeholder> phList = new ArrayList<>();

		phList.add(new Placeholder("GetOperation", op.getName()));
		phList.add(new Placeholder("ResourceType", op.getReference().getTitle()));

		StringBuilder assertions = new StringBuilder();

		Properties values = loadTemplateValues(m, op.getReference().getTitle());

		if (values.isEmpty()) assertions.append("/* No test assertions */");
		else
			for (Object o : values.keySet()) {
				if (!Boolean.parseBoolean(values.getProperty((String)o))) continue;
				if (assertions.length() > 0) assertions.append('\n').append('\t');
				assertions.append(String.format("Assert.assertNotNull(getRes.getResource().get%s());", StringUtils.capitalize((String)o)));
			}

		phList.add(new Placeholder("TestAssertions", assertions.toString()));

		List<String> bodyLines = loadTemplate(m, phList);
		if (!bodyLines.get(0).trim().isEmpty()) bodyLines.add(0, m.emptyLine());
		if (!bodyLines.get(bodyLines.size() - 1).trim().isEmpty()) bodyLines.add(m.emptyLine());

		m.setBody(bodyLines);

		return m;

	}


	static Method crudUpdateMethodBody(Operation op, Method m) {

		List<Placeholder> phList = new ArrayList<>();

		phList.add(new Placeholder("PutOperation", op.getName()));
		phList.add(new Placeholder("ResourceType", op.getReference().getTitle()));

		StringBuilder plFields = new StringBuilder();
		StringBuilder assertions = new StringBuilder();

		if (!op.getParameters().isEmpty()) {

			Map<String, String> fields = new HashMap<>();
			Map<String, String> fieldsKo = new HashMap<>();

			Properties values = loadTemplateValues(m, op.getReference().getTitle());
			
			if (values.isEmpty())
				for (Parameter p : op.getParameters()) {

				if (!p.isFormDataParam()) continue;

				String name = checkField(p, op, fieldsKo, false);

				String val = null;
				switch (p.getType()) {
					case Types.INTEGER:
					case Types.NUMBER: { val = "randomValue()"; break; }
					case Types.BOOLEAN: { val = String.format("!oldRes.get%s()", StringUtils.capitalize(name)); break; }
					case Types.STRING:
					default: { val = String.format("randomField(oldRes.get%s())", StringUtils.capitalize(name)); }
				}
				fields.put(name, String.format("%s", val));

			}
			else
				for (Object o : values.keySet())
					fields.put((String)o, values.getProperty((String)o));

			for (Map.Entry<String, String> f : fields.entrySet()) {

				if (plFields.length() > 0) plFields.append('\n').append('\t');
				if (fieldsKo.containsKey(f.getKey())) plFields.append("// ").append(fieldsKo.get(f.getKey())).append(" -> ");
				plFields.append(String.format("res.set%s(%s);", StringUtils.capitalize(f.getKey()), f.getValue()));

				if (assertions.length() > 0) assertions.append('\n').append('\t');
				if (fieldsKo.containsKey(f.getKey())) assertions.append("// ").append(fieldsKo.get(f.getKey())).append(" -> ");
				assertions.append(String.format("Assert.assertNotEquals(oldRes.get%1$s(), putRes.getResource().get%1$s());", StringUtils.capitalize(f.getKey())));

			}

		}
		else {
			plFields.append("/* No payload data */");
			assertions.append("/* No test assertions */");
		}

		phList.add(new Placeholder("PayloadData", plFields.toString()));
		phList.add(new Placeholder("TestAssertions", assertions.toString()));

		List<String> bodyLines = loadTemplate(m, phList);
		if (!bodyLines.get(0).trim().isEmpty()) bodyLines.add(0, m.emptyLine());
		if (!bodyLines.get(bodyLines.size() - 1).trim().isEmpty()) bodyLines.add(m.emptyLine());

		m.setBody(bodyLines);

		return m;

	}


	static Method crudDeleteMethodBody(Operation delOp, Operation getOp, Method m) {

		List<Placeholder> phList = new ArrayList<>();

		phList.add(new Placeholder("DeleteOperation", delOp.getName()));
		phList.add(new Placeholder("ResourceType", delOp.getReference().getTitle()));
		phList.add(new Placeholder("GetOperation", getOp.getName()));

		List<String> bodyLines = CRUDUtils.loadTemplate(m, phList);
		if (!bodyLines.get(0).trim().isEmpty()) bodyLines.add(0, m.emptyLine());
		if (!bodyLines.get(bodyLines.size() - 1).trim().isEmpty()) bodyLines.add(m.emptyLine());

		m.setBody(bodyLines);

		return m;

	}

}
