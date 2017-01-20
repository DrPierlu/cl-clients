package io.commercelayer.api.operation.common;

import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.model.common.ApiResource;

public abstract class GetOperation<T extends ApiResource> extends ApiOperation<T> {

	protected GetOperation(String path) {
		super(path);
	}

	@Override
	public Method getMethod() {
		return Method.GET;
	}

}
