package io.commercelayer.api.codegen.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.commercelayer.api.http.HttpRequest.Method;

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
	
	
	public Map<Method, Operation> getCRUDOperations() {
		
		Map<Method, Operation> ops = new HashMap<>();
		
		for (Operation op : getOperations()) {
			if (op.getId().endsWith("Id") || op.getMethod().equals(Method.POST)) ops.put(op.getMethod(), op);
			
		}
		
		return ops;
		
	}

}
