package io.commercelayer.api.codegen.model.gen.template;

public class Placeholder {

	private String name;
	private String value;

	public Placeholder(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}

	public static String getMarker(String name) {
		return String.format("${%s}", name);
	}
	
	public String getMarker() {
		return getMarker(getName());
	}
	
}
