package io.commercelayer.api.codegen;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import io.commercelayer.api.codegen.Method.Param;

public class ModelClass extends AbstractModelObject {

	private String classPackage;
	private String name;
	private Integer modifier;

	private List<Class<?>> importList = new ArrayList<>();
	private Class<?> extendedClass;
	private List<Class<?>> implementList = new ArrayList<>();
	private List<Method> methodList = new ArrayList<>();
	private List<Field> fieldList = new ArrayList<>();

	public ModelClass() {
		super();
	}

	public ModelClass(String classPackage, String className) {
		this();
		this.name = className;
		this.classPackage = classPackage;
	}

	public String getClassPackage() {
		return classPackage;
	}

	public void setClassPackage(String classPackage) {
		this.classPackage = classPackage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getModifier() {
		return modifier;
	}

	public void setModifier(Integer modifier) {
		this.modifier = modifier;
	}

	public List<Class<?>> getImportList() {
		return importList;
	}

	public Class<?> getExtendedClass() {
		return extendedClass;
	}

	public void setExtendedClass(Class<?> extendedClass) {
		this.extendedClass = extendedClass;
	}

	public List<Class<?>> getImplementList() {
		return implementList;
	}

	public void setImplementList(List<Class<?>> implementList) {
		this.implementList = implementList;
	}

	public List<Method> getMethodList() {
		return methodList;
	}

	public List<Field> getFieldList() {
		return fieldList;
	}

	public void addMethod(Method method) {
		this.methodList.add(method);
	}

	public void addField(Field field) {
		this.fieldList.add(field);
	}

	public void addField(Field field, boolean setter, boolean getter) {

		this.fieldList.add(field);

		if (setter) {
			Method m = new Method(Modifier.PUBLIC);
			m.setName("set".concat(StringUtils.capitalize(field.getName())));
			m.addSignatureParam(new Param(field));
			m.addBodyLine("this.".concat(field.getName()).concat(" = ").concat(field.getName()).concat(";"));
		}

		if (getter) {
			Method m = new Method(Modifier.PUBLIC);
			m.setName("get".concat(StringUtils.capitalize(field.getName())));
			m.setReturnType(field.getType());
			m.addBodyLine("return this.".concat(field.getName()).concat(";"));
		}

	}

	private void createImportList() {

		this.importList = new ArrayList<>();

		// Extended class
		addImportItem(getExtendedClass());

		// Implemented interfaces
		for (Class<?> c : getImplementList())
			addImportItem(c);

		// Fields
		for (Field f : getFieldList())
			addImportItem(f.getType());

		// Methods
		for (Method m : getMethodList()) {
			addImportItem(m.getReturnType());
			for (Param p : m.getSignatureParams())
				addImportItem(p.getType());
		}

	}

	private void addImportItem(Class<?> class_) {
		if (!class_.getName().startsWith("java.lang") && !this.importList.contains(class_))
			this.importList.add(class_);
	}

	public String generate() {

		createImportList();

		return null;
		
	}

}
