package io.commercelayer.api.operation;

import io.commercelayer.api.model.common.ApiResource;

public class MoveOperation<T extends ApiResource> extends GetOperation<T> {

	public MoveOperation(String path) {
		super(path);
	}

	public Long getPosition() {
		return (Long)getPathParam("position");
	}

	public void setPosition(Long position) {
		addPathParam("position", position);
	}

}
