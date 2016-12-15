package io.commercelayer.api.operation;

import io.commercelayer.api.http.HttpRequest.Method;

public class DeleteOperation extends ApiOperation implements IdOperation {

	public DeleteOperation(String path) {
		super(path);
	}
	
	public DeleteOperation(String path, Long id) {
		this(path);
		setId(id);
	}

	@Override
	public Method getMethod() {
		return Method.DELETE;
	}

	public Long getId() {
		return (Long) getPathParam(PARAM_ID);
	}

	public void setId(Long id) {
		addPathParam(PARAM_ID, id);
	}

}
