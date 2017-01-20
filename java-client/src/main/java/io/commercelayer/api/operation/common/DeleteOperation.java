package io.commercelayer.api.operation.common;

import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.model.common.ApiResource;

public class DeleteOperation<T extends ApiResource> extends ApiOperation<T> implements IdOperation {

	protected DeleteOperation(String path) {
		super(path);
	}
	
	protected DeleteOperation(String path, Long id) {
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
