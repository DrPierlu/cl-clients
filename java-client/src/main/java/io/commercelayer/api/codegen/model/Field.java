package io.commercelayer.api.codegen.model;

import java.lang.reflect.Modifier;

public class Field extends AbstractModelObject {

	private String name;
	private Integer modifier;
	private Class<?> type;
	
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
		if ((Modifier.fieldModifiers() & modifier.intValue()) == 0) throw new IllegalArgumentException("Invalid field modifier: " + modifier);
		this.modifier = modifier;
	}

	public Class<?> getType() {
		return type;
	}

	public void setType(Class<?> type) {
		this.type = type;
	}
	
	public String generate() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(Modifier.toString(modifier)).append(' ');
		sb.append(getType().getSimpleName()).append(' ');
		sb.append(getName()).append(';');
		
		return sb.toString();
		
	}
	
	
	public static void main(String[] args) {
		
		Field f = new Field(Modifier.PRIVATE, String.class, "shippingMethod");
		
		String code = f.generate();
		
		System.out.println(code);
		
	}

}
