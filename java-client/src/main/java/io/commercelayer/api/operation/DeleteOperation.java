package io.commercelayer.api.operation;

import io.commercelayer.api.http.HttpRequest.Method;

public class DeleteOperation extends ApiOperation {

	public DeleteOperation(String path) {
		super(path);
	}

	@Override
	public Method getMethod() {
		return Method.DELETE;
	}

	public Long getId() {
		return (Long) getPathParam("id");
	}

	public void setId(Long id) {
		addPathParam("id", id);
	}

}
