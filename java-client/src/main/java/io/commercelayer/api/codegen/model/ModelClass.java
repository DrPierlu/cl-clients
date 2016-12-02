package io.commercelayer.api.codegen.model;


import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import io.commercelayer.api.codegen.model.Method.Param;
import io.commercelayer.api.model.common.ApiResource;

public class ModelClass extends AbstractModelObject {

	private String classPackage;
	private String name;
	private Integer modifier;

	private List<Class<?>> importList = new ArrayList<>();
	private Class<?> extendedClass;
	private List<Class<?>> implementList = new ArrayList<>();
	private List<Method> methodList = new ArrayList<>();
	private List<Field> fieldList = new ArrayList<>();
	private List<? extends Throwable> exceptionList = new ArrayList<>();
	
	public ModelClass() {
		super();
	}

	public ModelClass(String classPackage, String className) {
		this();
		this.classPackage = classPackage;
		this.name = className;
	}
	
	public ModelClass(String classPackage, String className, Integer modifier) {
		this(classPackage, className);
		setModifier(modifier);
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

	public void setModifier(Integer modifier) throws IllegalArgumentException {
		if ((Modifier.classModifiers() & modifier.intValue()) == 0) throw new IllegalArgumentException("Invalid class modifier: " + modifier);
		this.modifier = modifier;
	}

	public List<Class<?>> getImportList() {
		return importList;
	}

	public Class<?> getExtendedClass() {
		return extendedClass;
	}

	public void setExtendedClass(Class<?> extendedClass) throws IllegalArgumentException {
		if (extendedClass.isInterface()) throw new IllegalArgumentException("Not valid class [" + extendedClass.getName() + "]");
		this.extendedClass = extendedClass;
	}

	public List<Class<?>> getImplementList() {
		return implementList;
	}

	public void setImplementList(List<Class<?>> implementList) throws IllegalArgumentException {
		if (implementList != null)
			for (Class<?> c : implementList) addImplementedInterface(c);
	}
	
	public void addImplementedInterface(Class<?> intf) throws IllegalArgumentException {
		if (!intf.isInterface()) throw new IllegalArgumentException("Not valid interface [" + intf.getName() + "]");
		this.implementList.add(intf);
	}
	
	public List<? extends Throwable> getExceptionList() {
		return exceptionList;
	}

	public void setExceptionList(List<? extends Throwable> exceptionList) {
		if (exceptionList != null) this.exceptionList = exceptionList;
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

	public boolean addField(Field field) {
		if (getExtendedClass() != null)
			try {
				if (getExtendedClass().getDeclaredField(field.getName()) != null) return false;
			} catch (NoSuchFieldException | SecurityException e) {
				
			}
		this.fieldList.add(field);
		return true;
	}

	public boolean addField(Field field, boolean setter, boolean getter) {

		if (!addField(field)) return false;

		if (setter) {
			Method m = new Method(Modifier.PUBLIC);
			m.setName("set".concat(StringUtils.capitalize(field.getName())));
			m.addSignatureParam(new Param(field));
			m.addBodyLine("this.".concat(field.getName()).concat(" = ").concat(field.getName()).concat(";"));
			addMethod(m);
		}

		if (getter) {
			Method m = new Method(Modifier.PUBLIC);
			m.setName("get".concat(StringUtils.capitalize(field.getName())));
			m.setReturnType(field.getType());
			m.setListType(field.getListType());
			m.addBodyLine("return this.".concat(field.getName()).concat(";"));
			addMethod(m);
		}
		
		
		return true;

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
			for (Throwable t : m.getExceptionList())
				addImportItem(t.getClass());
		}

	}

	private void addImportItem(Class<?> class_) {
		if (class_ == null) return;
		else
		if (!class_.getName().startsWith("java.lang") && !this.importList.contains(class_))
			this.importList.add(class_);
	}

	public String generate() {

		createImportList();

		StringBuilder sb = new StringBuilder();
		
		
		// Package
		sb.append("package ").append(getClassPackage()).append(';').append(newLine());
		sb.append(newLine());
		
		
		// Imports
		for (Class<?> c : getImportList())
			sb.append("import ").append(c.getName()).append(';').append(newLine());
		sb.append(newLine());
		
		
		// Class
		if (getComment() != null) {
			sb.append("/**").append(newLine());
			sb.append(" * ").append(getComment()).append(newLine());
			sb.append(" */").append(newLine());
		}
		sb.append(Modifier.toString(getModifier())).append(" class ").append(getName());
		if (getExtendedClass() != null) sb.append(" extends ").append(getExtendedClass().getSimpleName());
		
		if (!getImplementList().isEmpty()) {
			sb.append(" implements ");
			int i = 0;
			for (Class<?> c : getImplementList()) {
				if (i > 0) sb.append(", ");
				sb.append(c.getSimpleName());
			}
		}
		
		if (!getExceptionList().isEmpty()) {
			sb.append(' ');
			int i = 0;
			for (Throwable t : getExceptionList()) {
				if (i > 0) sb.append(", ");
				sb.append(t.getClass().getSimpleName());
			}
		}
		
		sb.append(" {").append(newLines(2));
		
		
		// serialVersionUID
		sb.append(serialVersionUID());
		
		
		// Fields
		for (Field f : getFieldList()) {
			sb.append('\t');
			sb.append(newLines(f.getLinesBefore()));
			sb.append(f.generate()).append(newLine());
			sb.append(newLines(f.getLinesAfter()));
		}
		sb.append(newLine());
		
		
		// Methods
		for (Method m : getMethodList()) {
			sb.append(newLines(m.getLinesBefore()));
			sb.append('\t').append(m.generate().replaceAll("\n", "\n\t"));
			sb.append(newLines(m.getLinesAfter()));
		}
		
		
		sb.append('}').append(newLine());
		
		return sb.toString();
		
	}
	
	
	private String serialVersionUID() {
		
		String sv = "";
		
		for (Class<?> c : getImplementList()) {
			if (c instanceof Serializable) {
				sv = "\n\tprivate static final long serialVersionUID = 1L;\n\n";
				break;
			}
		}
		
		return sv;
		
	}
	
	
	public static void main(String[] args) {
		
		ModelClass mc = new ModelClass("io.commercelayer.api.test.codegen", "TestClass", Modifier.PUBLIC);
		
		mc.setExtendedClass(ApiResource.class);
		mc.addImplementedInterface(Serializable.class);
		
		mc.addField(new Field(Modifier.PRIVATE, String.class, "campo1"));
		mc.addField(new Field(Modifier.PRIVATE, Integer.class, "campo2"));
		mc.addField(new Field(Modifier.PRIVATE, Date.class, "dataDa"), true, true);
		mc.addField(new Field(Modifier.PRIVATE, Date.class, "dataA"));
		
		String code = mc.generate();
		
		System.out.println(code);
		
	}

}
