package io.commercelayer.api.codegen;

import java.lang.reflect.Modifier;

public class Field extends AbstractModelObject {

	private String name;
	private Integer modifier;
	private Class<?> type;

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
		sb.append(Modifier.toString(modifier));
		
		return null;
		
		
	}
	
	

}
