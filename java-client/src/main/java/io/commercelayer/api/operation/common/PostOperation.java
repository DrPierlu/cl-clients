package io.commercelayer.api.operation.common;

import io.commercelayer.api.http.HttpRequest.Method;

public class PostOperation extends PayloadOperation {

	protected PostOperation(String path) {
		super(path);
	}

	@Override
	public Method getMethod() {
		return Method.POST;
	}

}
