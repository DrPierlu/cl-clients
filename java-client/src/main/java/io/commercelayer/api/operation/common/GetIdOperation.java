package io.commercelayer.api.operation.common;

import io.commercelayer.api.model.common.ApiResource;

public class GetIdOperation<T extends ApiResource> extends GetOperation<T> implements IdOperation {
	
	protected GetIdOperation(String path) {
		super(path);
	}
	
	protected GetIdOperation(String path, Long id) {
		this(path);
		setId(id);
	}
	

	public Long getId() {
		return (Long) getPathParam(PARAM_ID);
	}

	public void setId(Long id) {
		addPathParam(PARAM_ID, id);
	}

}
