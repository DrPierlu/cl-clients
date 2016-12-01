package io.commercelayer.api.codegen.schema;

import java.util.ArrayList;
import java.util.List;

public class Resource {

	private String path;
	private List<Operation> operations = new ArrayList<>();

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
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

}
