package io.commercelayer.api.operation.common;

import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.model.common.ApiResource;

public class PostOperation<T extends ApiResource> extends PayloadOperation<T> {

	protected PostOperation(String path) {
		super(path);
	}

	@Override
	public Method getMethod() {
		return Method.POST;
	}

}
