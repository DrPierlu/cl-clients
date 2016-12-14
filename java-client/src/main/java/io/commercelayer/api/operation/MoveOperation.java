package io.commercelayer.api.operation;

import io.commercelayer.api.model.common.ApiResource;

public class MoveOperation<T extends ApiResource> extends GetOperation<T> {
	
	private static final String PARAM_POSITION = "position";

	public MoveOperation(String path) {
		super(path);
	}

	public Long getPosition() {
		return (Long)getPathParam(PARAM_POSITION);
	}

	public void setPosition(Long position) {
		addPathParam(PARAM_POSITION, position);
	}

}
