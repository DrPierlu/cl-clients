package io.commercelayer.api.codegen.model.gen;

import java.lang.reflect.Modifier;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.codegen.ApiCodegenException;
import io.commercelayer.api.codegen.model.Constructor;
import io.commercelayer.api.codegen.model.CustomConstructor;
import io.commercelayer.api.codegen.model.Field;
import io.commercelayer.api.codegen.model.Method;
import io.commercelayer.api.codegen.model.Method.Param;
import io.commercelayer.api.codegen.model.Model;
import io.commercelayer.api.codegen.model.ModelClass;
import io.commercelayer.api.codegen.model.Type;
import io.commercelayer.api.codegen.schema.Definition;
import io.commercelayer.api.codegen.schema.Operation;
import io.commercelayer.api.codegen.schema.Parameter;
import io.commercelayer.api.codegen.schema.Property;
import io.commercelayer.api.codegen.schema.Resource;
import io.commercelayer.api.codegen.schema.Schema;
import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.ApiOperation;
import io.commercelayer.api.operation.common.DeleteOperation;
import io.commercelayer.api.operation.common.GetIdOperation;
import io.commercelayer.api.operation.common.IdOperation;
import io.commercelayer.api.operation.common.MoveOperation;
import io.commercelayer.api.operation.common.PayloadOperation;
import io.commercelayer.api.operation.common.PostOperation;
import io.commercelayer.api.operation.common.PutOperation;
import io.commercelayer.api.operation.common.SearchOperation;
import io.commercelayer.api.util.ModelUtils;

public class ApiModelGen {

	private static final Logger logger = LoggerFactory.getLogger(ApiModelGen.class);

	private static final boolean GENERATE_OBJECT_CLASSES 	= true;
	private static final boolean GENERATE_OPERATION_CLASSES = true;
	private static final boolean GENERATE_TEST_CLASSES 		= true;

	public static final String PACKAGE_OBJECT 		= ApiResource.class.getPackage().getName().replaceFirst(".common", "");
	public static final String PACKAGE_OPERATION	= ApiOperation.class.getPackage().getName().replaceFirst(".common", "");
	public static final String PACKAGE_TEST 		= "io.commercelayer.api.test.generated";
	public static final String PACKAGE_UTIL			= ApiOperation.class.getPackage().getName().concat(".util");

	
	public Model createModel(Schema schema) throws ApiCodegenException {

		logger.info("Creating API Model ...");

		Model model = new Model();

		// Object classes
		logger.info("Generating model objects ...");

		if (GENERATE_OBJECT_CLASSES) {
			List<Definition> definitions = schema.getDefinitions();
			for (Definition def : definitions) {
				ModelClass objClass = createObjectClass(PACKAGE_OBJECT, def);
				if (model.addClass(objClass)) /* logger.info("Definition: {}", objClass.getName()) */;
				else logger.warn("Definition skipped: {}", def.getTitle());
			}
		}

		
		// Operation classes
		logger.info("Generating operations ...");

		if (GENERATE_OPERATION_CLASSES) {
			List<Resource> resources = schema.getResources();
			for (Resource res : resources) {
				for (Operation op : res.getOperations()) {
					ModelClass opClass = createOperationClass(PACKAGE_OPERATION, res.getPath(), op);
					if (model.addClass(opClass)) /* logger.info("Operation: {} {}", op.getMethod(), res.getPath()) */;
					else logger.warn("Operation skipped: {} {}", op.getMethod(), res.getPath());
				}
			}
		}
		
		
		// Test classes
		logger.info("Generating tests ...");
		
		if (GENERATE_TEST_CLASSES) {
			List<Definition> definitions = schema.getDefinitions();
			for (Definition def : definitions) {
				ModelClass testClass = createTestClass(PACKAGE_TEST, def);
				if (model.addClass(testClass)) /* logger.info("Test: {}", testClass.getName()) */;
				else logger.warn("Definition skipped: {}", def.getTitle());
			}
		}

		
		model.addClass(createOperationsCatalogue(schema, PACKAGE_UTIL));
		
		
		logger.info("Model generated");

		return model;

	}
	
	
	private ModelClass createOperationsCatalogue(Schema schema, String pkg) {
		
		logger.info("Creating Operations Catalogue ...");
		
		ModelClass mc = new ModelClass(pkg, "ApiOperations");
		mc.setModifier(Modifier.PUBLIC | Modifier.FINAL);
		mc.setComment(mc.getName());
		
		mc.addImportItem(new Type(PACKAGE_OPERATION.concat(".*")));
				
		for (Resource res : schema.getResources()) {
			for (Operation op : res.getOperations()) {
				
				Method m = new Method(Modifier.PUBLIC | Modifier.STATIC);
				m.setLinesBefore(0);
				m.setLinesAfter(1);
				
				m.setComment("%s %s", op.getMethod(), res.getPath());
				
				String name = StringUtils.capitalize(op.getId());
				m.setName(name);
				m.setReturnType(new Type(PACKAGE_OPERATION.concat(".").concat(name)));
				
				m.addBodyLine("return new %s();", name);
				
				mc.addMethod(m);
				
			}
		}
		
		return mc;
		
	}
	


	private Type decodePropertyType(Property p) {

		Class<?> type = null;
		Class<?> typeGen = null;

		switch (p.getType()) {
			case Property.Types.STRING: {
				type = String.class;
				if (p.getFormat() != null) {
					switch (p.getFormat()) {
						case Property.Formats.DATE_TIME: { type = LocalDateTime.class; break; }
						default: type = String.class;
					}
				}
				break;
			}
			case Property.Types.INTEGER: {
				type = Integer.class;
				if (p.getFormat() != null) {
					switch (p.getFormat()) {
						case Property.Formats.INT32: { type = Integer.class; break; }
						default: type = Integer.class;
					}
				}
				break;
			}
			case Property.Types.NUMBER: {
				type = Integer.class;
				if (p.getFormat() != null) {
					switch (p.getFormat()) {
						case Property.Formats.FLOAT: { type = Float.class; break; }
						default: type = Integer.class;
					}
				}
				break;
			}
			case Property.Types.ARRAY: {
				type = List.class;
				if (p.getItemType() != null)
					switch (p.getItemType()) {
						case Property.Types.STRING: { typeGen = String.class; break; }
						case Property.Types.INTEGER: { typeGen = Integer.class; break; }
						case Property.Types.NUMBER: { typeGen = Integer.class; break; }
						case Property.Types.OBJECT:
						default: typeGen = Object.class;
					}
				break;
			}
			case Property.Types.OBJECT:
			default: type = Object.class;
		}
		

		return new Type(type, typeGen);

	}
	

	private ModelClass createObjectClass(String modelPackage, Definition def) {

		ModelClass mc = new ModelClass(modelPackage, def.getTitle(), Modifier.PUBLIC);
		mc.setComment(mc.getName());

		mc.setExtendedClass(ApiResource.class);

		mc.addConstructor(new Constructor(mc.getName(), Modifier.PUBLIC));
		mc.addConstructor(new Constructor(mc.getName(), Modifier.PUBLIC, new Constructor.Param(Long.class, IdOperation.PARAM_ID, true)));

		for (Property p : def.getProperties()) {

			Field field = new Field(Modifier.PRIVATE, decodePropertyType(p), ModelUtils.toCamelCase(p.getName()));

			if (p.isReadonly() || Object.class.equals(field.getType().getTypeClass()))
				field.addAnnotation(JsonExclude.class);

			if (!mc.addField(field, true, true, true)) {
				// logger.warn("Field skipped: {}.{}", def.getTitle(), field.getName());
			}

		}

		createMethodEquals(mc);
		createMethodHashCode(mc);
		createMethodClone(mc);

		return mc;

	}

	private void createMethodEquals(final ModelClass mc) {

		Method m = new Method(Modifier.PUBLIC);

		m.addAnnotation(Override.class);

		m.setName("equals");
		m.setReturnType(boolean.class);
		m.addSignatureParam(new Method.Param(Object.class, "o"));
		mc.addImportItem(Objects.class);

		// Method Body
		m.addBodyLine(m.emptyLine());

		m.addBodyLine("if (this == o) return true;");
		m.addBodyLine("if ((o == null) || (getClass() != o.getClass())) return false;");
		m.addBodyLine(m.emptyLine());
		m.addBodyLine("%1$s x = (%1$s)o;", mc.getName());
		m.addBodyLine(m.emptyLine());
		m.addBodyLine("return super.equals(o)");

		for (Field f : mc.getFieldList()) {
			if (Modifier.isPrivate(f.getModifier()) && !Modifier.isStatic(f.getModifier()))
				m.addBodyLine("\t&& Objects.equals(this.%1$s, x.%1$s)", f.getName());
		}

		m.addBodyLine(";");
		m.addBodyLine(m.emptyLine());

		mc.addMethod(m);

	}

	private void createMethodHashCode(ModelClass mc) {

		Method m = new Method(Modifier.PUBLIC);

		m.addAnnotation(Override.class);

		m.setName("hashCode");
		m.setReturnType(int.class);
		mc.addImportItem(Objects.class);

		// Method Body
		m.addBodyLine(m.emptyLine());

		m.addBodyLine("return Objects.hash(");

		List<String> fieldList = new ArrayList<>();
		if ((mc.getExtendedClass() != null) && (mc.getExtendedClass().getTypeClass() != null))
		for (java.lang.reflect.Field f : mc.getExtendedClass().getTypeClass().getDeclaredFields())
			if (Modifier.isPrivate(f.getModifiers()) && !Modifier.isStatic(f.getModifiers()))
				fieldList.add(f.getName());
		for (Field f : mc.getFieldList())
			if (Modifier.isPrivate(f.getModifier()) && !Modifier.isStatic(f.getModifier()))
				fieldList.add(f.getName());

		int i = 0;
		StringBuilder sb = new StringBuilder("\t");
		for (String f : fieldList) {
			sb.append(f);
			if (++i != fieldList.size()) sb.append(",");
			if ((i % 5) == 0) {
				m.addBodyLine(sb.toString());
				sb = new StringBuilder("\t");
			} else
				sb.append(' ');
		}
		m.addBodyLine(sb.toString());

		m.addBodyLine(");");

		m.addBodyLine(m.emptyLine());

		mc.addMethod(m);

	}

	private void createMethodClone(ModelClass mc) {

		Method m = new Method(Modifier.PUBLIC);

		m.addAnnotation(Override.class);

		m.setName("clone");
		m.setReturnType(new Type(mc.getName()));

		// Method Body
		m.addBodyLine(m.emptyLine());
		m.addBodyLine("%1$s no = new %1$s();", mc.getName());
		m.addBodyLine(m.emptyLine());
		
		m.addBodyLine("no = super.clone(no);");
		m.addBodyLine(m.emptyLine());

		List<String> fieldList = new ArrayList<>();
		if ((mc.getExtendedClass() != null) && (mc.getExtendedClass().getTypeClass() != null))
			for (java.lang.reflect.Field f : mc.getExtendedClass().getTypeClass().getDeclaredFields())
				if (Modifier.isPrivate(f.getModifiers()) && !Modifier.isStatic(f.getModifiers()))
					fieldList.add(f.getName());
		for (Field f : mc.getFieldList())
			if (Modifier.isPrivate(f.getModifier()) && !Modifier.isStatic(f.getModifier()))
				fieldList.add(f.getName());

		for (String f : fieldList) {
			m.addBodyLine("no.%1$s = this.%1$s;", f);
		}

		m.addBodyLine(m.emptyLine());
		m.addBodyLine("return no;");
		m.addBodyLine(m.emptyLine());

		mc.addMethod(m);

	}

	private ModelClass createOperationClass(String modelPackage, String path, Operation op) {

		ModelClass mc = new ModelClass(modelPackage, StringUtils.capitalize(op.getId()), Modifier.PUBLIC);
		mc.setComment(mc.getName());

		Class<? extends ApiOperation> extClass = null;

		switch (op.getMethod()) {
			case GET: {
				extClass = path.endsWith("{id}")? GetIdOperation.class : SearchOperation.class;
				break;	
			}
			case POST: {
				extClass = PostOperation.class;
				break;
			}
			case PUT: {
				extClass = path.contains("/move_")? MoveOperation.class : PutOperation.class;
				break;
			}
			case DELETE: {
				extClass = DeleteOperation.class;
				break;
			}
		}

		mc.setExtendedClass(extClass);
		
		
		final String operationPathField = "OPERATION_PATH";
		
		Field pf = new Field(Modifier.PUBLIC|Modifier.STATIC|Modifier.FINAL, String.class, operationPathField);
		pf.setInitialization(String.format("\"%s\"", path));
		mc.addField(pf);


		// Constructor
		CustomConstructor cc = new CustomConstructor();
		
		cc.setModifier(Modifier.PUBLIC);
		cc.setName(mc.getName());
		cc.addBodyLine("super(%s);", operationPathField);
		
		mc.addConstructor(cc);
		
		
		// IdOperation
		if ((mc.getExtendedClass() != null) && (mc.getExtendedClass().getTypeClass() != null))
		if (IdOperation.class.isAssignableFrom(mc.getExtendedClass().getTypeClass())) {
			
			CustomConstructor ccid = new CustomConstructor();
			
			ccid.setModifier(Modifier.PUBLIC);
			ccid.setName(mc.getName());
			ccid.addSignatureParam(new Constructor.Param(Long.class, IdOperation.PARAM_ID));
			ccid.addBodyLine("super(%s, %s);", operationPathField, IdOperation.PARAM_ID);
			
			mc.addConstructor(ccid);
			
		}
		
		
		// PayloadOperation
		if ((mc.getExtendedClass() != null) && (mc.getExtendedClass().getTypeClass() != null))
		if (PayloadOperation.class.isAssignableFrom(mc.getExtendedClass().getTypeClass()))
		if (!op.getParameters().isEmpty()) {
		
			StringBuilder sb = new StringBuilder();
			
			for (Parameter p : op.getParameters()) {
				if (sb.length() > 0) sb.append('\n');
				String name = ModelUtils.getObjectField(p.getName(), true);
				// if (IdOperation.class.isAssignableFrom(mc.getExtendedClass().getTypeClass()) && (IdOperation.PARAM_ID.equals(name))) continue;
				sb.append("addRequiredField(\"").append(name).append("\");");
			}
			
			mc.setInitBlock(sb.toString());
			
		}
		
		
		if (path.indexOf("{") != -1) {
			
			Pattern pattern = Pattern.compile("\\{[\\w_]+\\}");
			Matcher matcher = pattern.matcher(path);
			
            while (matcher.find()) {
            	
            	String param_ = matcher.group().replaceAll("[\\{\\}]", "");
            	String param = ModelUtils.toCamelCase(param_);
            	
            	if (ArrayUtils.contains(new String[]{IdOperation.PARAM_ID, MoveOperation.PARAM_POSITION}, param)) continue;
            	
            	
            	// Set Param
            	Method ms = new Method(Modifier.PUBLIC);
            	ms.setName("set".concat(StringUtils.capitalize(param)));
            	
            	ms.addSignatureParam(new Param(Object.class, param));
            	
            	ms.addBodyLine("addPathParam(\"%s\", %s);", param_, param);
            	
            	mc.addMethod(ms);
            	
            	
            	// Get Param
            	Method mg = new Method(Modifier.PUBLIC);
            	mg.setName("get".concat(StringUtils.capitalize(param)));
            	mg.setReturnType(Object.class);
            	
            	mg.addBodyLine("return getPathParam(\"%s\");", param_);
            	
            	mc.addMethod(mg);
            	
            }
			
		}
		

		return mc;

	}

	private ModelClass createTestClass(String testPackage, Definition def) {

		final class CRUD {
			public static final String CREATE 	= "testCreate";
			public static final String READ 	= "testRead";
			public static final String UPDATE 	= "testUpdate";
			public static final String DELETE 	= "testDelete";
		}
		
		
		ModelClass mc = new ModelClass(testPackage, def.getTitle().concat("Test"), Modifier.PUBLIC);
		mc.setComment(mc.getName());

		mc.setExtendedClass(new Type("io.commercelayer.api.test.common.IntegrationTest", def.getTitle()));
		
		mc.addImportItem(new Type("io.commercelayer.api.test.common.TestException"));
		
		final String res = ApiResource.class.getPackage().getName().replace(".common", ".").concat(def.getTitle());

		
		// Test Create Method
		Method tcm = new Method(Modifier.PUBLIC);
		
		tcm.addAnnotation(Override.class);
		tcm.setReturnType(new Type(ApiResponse.class, res));
		tcm.setName(CRUD.CREATE);
		tcm.addSignatureParam(new Param(ApiCaller.class, "caller"));
		
		tcm.addBodyLine("throw new TestException(\"%s.%s not implemented\");", mc.getName(), tcm.getName());
		// tcm.addBodyLine("return null;");
		
		mc.addMethod(tcm);
		
		
		// Test Read Method
		Method trm = new Method(Modifier.PUBLIC);
		
		trm.addAnnotation(Override.class);
		trm.setReturnType(new Type(ApiResponse.class, res));
		trm.setName(CRUD.READ);
		trm.setSignatureParams(new Param(new Type(res), "res"), new Param(ApiCaller.class, "caller"));
		
		trm.addBodyLine("throw new TestException(\"%s.%s not implemented\");", mc.getName(), trm.getName());
		// trm.addBodyLine("return null;");
		
		mc.addMethod(trm);
		
		
		// Test Update Method
		Method tum = new Method(Modifier.PUBLIC);
		
		tum.addAnnotation(Override.class);
		tum.setReturnType(new Type(ApiResponse.class, res));
		tum.setName(CRUD.UPDATE);
		tum.setSignatureParams(new Param(new Type(res), "oldRes"), new Param(ApiCaller.class, "caller"));
		
		tum.addBodyLine("throw new TestException(\"%s.%s not implemented\");", mc.getName(), tum.getName());
		// tum.addBodyLine("return null;");
		
		mc.addMethod(tum);
		
		
		// Test Delete Method
		Method tdm = new Method(Modifier.PUBLIC);
		
		tdm.addAnnotation(Override.class);
		tdm.setReturnType(new Type(ApiResponse.class, res));
		tdm.setName(CRUD.DELETE);
		tdm.setSignatureParams(new Param(new Type(res), "res"), new Param(ApiCaller.class, "caller"));
		
		tdm.addBodyLine("throw new TestException(\"%s.%s not implemented\");", mc.getName(), tdm.getName());
		// tdm.addBodyLine("return null;");
		
		mc.addMethod(tdm);
		
		
		// Main method
		Method mm = new Method(Modifier.PUBLIC | Modifier.STATIC);
		mm.setName("main");
		mm.addSignatureParam(new Param(String[].class, "args"));
		
		mm.addBodyLine(mm.emptyLine());
		mm.addBodyLine("%1$s test = new %1$s();", mc.getName());
		mm.addBodyLine(mm.emptyLine());
		mm.addBodyLine("test.runTest();");
		mm.addBodyLine(mm.emptyLine());
		mm.addBodyLine("// %s();", tcm.getName());
		mm.addBodyLine("// %s();", trm.getName());
		mm.addBodyLine("// %s();", tum.getName());
		mm.addBodyLine("// %s();", tdm.getName());
		mm.addBodyLine(mm.emptyLine());
		
		mc.addMethod(mm);
		
		
		return mc;
		
	}

}
