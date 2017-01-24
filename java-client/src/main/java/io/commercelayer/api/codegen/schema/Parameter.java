package io.commercelayer.api.codegen.schema;

public class Parameter {

	private String name;
	private String type;
	private boolean required;
	private String format;
	private String description;
	private String inputType;
	private String pattern;
	private boolean allowEmptyValue;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public boolean isRequired() {
		return required;
	}


	public void setRequired(boolean required) {
		this.required = required;
	}


	public String getFormat() {
		return format;
	}


	public void setFormat(String format) {
		this.format = format;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getInputType() {
		return inputType;
	}


	public void setInputType(String inputType) {
		this.inputType = inputType;
	}


	public String getPattern() {
		return pattern;
	}


	public void setPattern(String pattern) {
		this.pattern = pattern;
	}


	public boolean isAllowEmptyValue() {
		return allowEmptyValue;
	}


	public void setAllowEmptyValue(boolean allowEmptyValue) {
		this.allowEmptyValue = allowEmptyValue;
	}
	
	public boolean isStringField() {
		return Property.Types.STRING.equals(this.type);
	}
	
	public boolean isIntegerField() {
		return Property.Types.INTEGER.equals(this.type) || Property.Types.NUMBER.equals(this.type);
	}
	
	public boolean isFormDataParam() {
		return "formData".equals(this.inputType);
	}
	
	public boolean isBooleanField() {
		return Property.Types.BOOLEAN.equals(this.type);
	}

}
