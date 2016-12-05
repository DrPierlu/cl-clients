package io.commercelayer.api.codegen.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Method extends AbstractModelObject {

	private Class<?> returnType;
	private Class<?> listType;
	private List<Param> signatureParams = new ArrayList<>();
	private List<String> body = new ArrayList<>();
	private List<Class<? extends Exception>> exceptionList = new ArrayList<>();
	private List<Class<? extends Annotation>> annotationList = new ArrayList<>();

	public Method() {
		super();
	}
	
	public Method(Integer modifier) {
		this();
		this.modifier = modifier;
	}


	public void setModifier(Integer modifier) throws IllegalArgumentException {
		if ((Modifier.methodModifiers() & modifier.intValue()) == 0)
			throw new IllegalArgumentException("Invalid method modifier: " + modifier);
		this.modifier = modifier;
	}

	public Class<?> getReturnType() {
		return returnType;
	}

	public void setReturnType(Class<?> returnType) {
		this.returnType = returnType;
	}

	public List<Param> getSignatureParams() {
		return signatureParams;
	}

	public void setSignatureParams(List<Param> signatureParams) {
		this.signatureParams = signatureParams;
	}

	public void setSignatureParams(Param... signatureParams) {
		this.signatureParams = Arrays.asList(signatureParams);
	}

	public void addSignatureParam(Param param) {
		this.signatureParams.add(param);
	}

	public List<String> getBody() {
		return body;
	}

	public void setBody(List<String> body) {
		this.body = body;
	}

	public void addBodyLine(String line) {
		this.body.add(line);
	}
	
	public void addBodyLine(String line, Object... params) {
		addBodyLine(String.format(line, params));
	}

	public List<Class<? extends Exception>> getExceptionList() {
		return exceptionList;
	}

	public void setExceptionList(List<Class<? extends Exception>> exceptionList) {
		if (exceptionList != null)
			this.exceptionList = exceptionList;
	}
	
	public void addException(Class<? extends Exception> e) {
		this.exceptionList.add(e);
	}
	
	public Class<?> getListType() {
		return listType;
	}

	public void setListType(Class<?> listType) {
		this.listType = listType;
	}

	public List<Class<? extends Annotation>> getAnnotationList() {
		return annotationList;
	}
	
	public boolean addAnnotation(Class<? extends Annotation> annotation) {
		if (!annotation.isAnnotation()) return false;
		this.annotationList.add(annotation);
		return true;
	}

	public String generate() {

		StringBuilder sb = new StringBuilder();

		if (!getAnnotationList().isEmpty()) {
			for (Class<? extends Annotation> a : getAnnotationList())
			sb.append('@').append(a.getSimpleName()).append(newLine());
		}
		
		sb.append(Modifier.toString(getModifier())).append(' ');
		sb.append((getReturnType() == null) ? "void" : strType(getReturnType(), getListType())).append(' ');
		sb.append(getName()).append('(');

		if (!getSignatureParams().isEmpty()) {
			int params = 0;
			for (Param p : getSignatureParams()) {
				if (params > 0)
					sb.append(", ");
				sb.append(strType(p.getType(), p.getListType())).append(' ').append(p.getName());
				params++;
			}
		}
		sb.append(')');

		if (!getExceptionList().isEmpty()) {
			sb.append(" throws ");
			int items = 0;
			for (Class<? extends Exception> e : getExceptionList()) {
				if (items > 0)
					sb.append(", ");
				sb.append(e.getSimpleName());
				items++;
			}
		}

		sb.append(" {").append(newLine());

		for (String l : getBody()) {
			if (StringUtils.isNotEmpty(l))
				sb.append('\t').append(l);
			sb.append(newLine());
		}

		sb.append('}').append(newLine());

		return sb.toString();

	}

	public static class Param {

		private Class<?> type;
		private String name;
		private Class<?> listType;

		public Param(Field field) {
			this(field.getType(), field.getName());
			this.listType = field.getListType();
		}

		public Param(Class<?> type, String name) {
			this.type = type;
			this.name = name;
		}

		public Class<?> getType() {
			return type;
		}

		public String getName() {
			return name;
		}

		public Class<?> getListType() {
			return listType;
		}

		public void setListType(Class<?> listType) {
			this.listType = listType;
		}

	}

	public int getLinesBefore() {
		return 1;
	}

	public int getLinesAfter() {
		return 1;
	}

	public static void main(String[] args) {

		Method m = new Method(Modifier.PUBLIC);
		m.setName("updateAddress");
		m.setReturnType(String.class);
		m.setSignatureParams(new Param(Integer.class, "numCiv"), new Param(String.class, "via"));

		List<String> b = new ArrayList<>();
		b.add("this.numCiv = numCiv;");
		b.add("this.indirizzo = via;");
		b.add(m.emptyLine());
		b.add("return new Integer(1);");

		m.setBody(b);

		String code = m.generate();

		System.out.println(code);

	}

}
