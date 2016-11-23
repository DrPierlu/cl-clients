package io.commercelayer.api.swagger;

import java.util.ArrayList;
import java.util.List;

public class Definition {

	private String title;
	private List<Property> properties = new ArrayList<>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public void addProperty(Property property) {
		this.properties.add(property);
	}

}
