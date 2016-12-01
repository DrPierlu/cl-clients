package io.commercelayer.api.codegen.schema;

public class Property {

	private String name;
	private String type;
	private String format;
	private boolean required;
	private boolean readonly;
	private String description;
	private String itemType;

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

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public boolean isReadonly() {
		return readonly;
	}

	public void setReadonly(boolean readonly) {
		this.readonly = readonly;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public static interface Types {
		String STRING = "string";
		String INTEGER = "integer";
		String NUMBER = "number";
		String OBJECT = "object";
		String ARRAY = "array";
	}

	public static interface Formats {
		String INT32 = "int32";
		String DATE_TIME = "date-time";
		String FLOAT = "float";
	}

}
