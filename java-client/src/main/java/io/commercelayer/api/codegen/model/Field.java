package io.commercelayer.api.codegen.model;

import java.lang.reflect.Modifier;

public class Field extends AbstractModelObject {

	private Class<?> type;
	private Class<?> listType;
	private String initialization;

	public Field() {
		super();
	}

	public Field(Integer modifier) {
		this();
		setModifier(modifier);
	}

	public Field(Integer modifier, Class<?> type, String name) {
		this(modifier);
		this.type = type;
		this.name = name;
	}

	public void setModifier(Integer modifier) throws IllegalArgumentException {
		if ((Modifier.fieldModifiers() & modifier.intValue()) == 0)
			throw new IllegalArgumentException("Invalid field modifier: " + modifier);
		this.modifier = modifier;
	}

	public Class<?> getType() {
		return type;
	}

	public void setType(Class<?> type) {
		this.type = type;
	}

	public Class<?> getListType() {
		return listType;
	}

	public void setListType(Class<?> listType) {
		this.listType = listType;
	}

	private String strType() {
		return super.strType(getType(), getListType());
	}

	public String getInitialization() {
		return initialization;
	}

	public void setInitialization(String initialization) {
		this.initialization = initialization;
	}

	public String generate() {

		StringBuilder sb = new StringBuilder();

		if (!getAnnotationList().isEmpty()) {
			for (Class<?> a : getAnnotationList()) {
				sb.append('@').append(a.getSimpleName());
				sb.append(newLine());
			}
		}

		sb.append(Modifier.toString(modifier)).append(' ');
		sb.append(strType()).append(' ').append(getName());
		
		if (this.initialization != null)
			sb.append(" = ").append(this.initialization);
		
		sb.append(';');

		return sb.toString();

	}

	public static void main(String[] args) {

		Field f = new Field(Modifier.PRIVATE, String.class, "shippingMethod");

		String code = f.generate();

		System.out.println(code);

	}

}
