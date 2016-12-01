package io.commercelayer.api.codegen.schema;

import java.util.ArrayList;
import java.util.List;

import io.commercelayer.api.http.HttpRequest.Method;

public class Operation {

	private Method method;
	private String id;
	private List<Parameter> parameters = new ArrayList<>();

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}
	
	public void setMethod(String method) {
		if (method != null) this.method = Method.valueOf(method.toUpperCase());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}
	
	public void addParameter(Parameter parameter) {
		this.parameters.add(parameter);
	}

}
