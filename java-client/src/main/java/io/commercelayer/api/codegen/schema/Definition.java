package io.commercelayer.api.codegen.schema;

import java.util.ArrayList;
import java.util.List;

public class Definition {

	private String title;
	private List<Property> properties = new ArrayList<>();
	private List<Operation> operations = new ArrayList<>();


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


	public List<Operation> getOperations() {
		return operations;
	}


	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}


	public void addOperation(Operation operation) {
		this.operations.add(operation);
	}
	
	public String toString() {
		return getTitle();
	}

}
