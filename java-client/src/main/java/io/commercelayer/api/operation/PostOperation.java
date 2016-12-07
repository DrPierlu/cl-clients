package io.commercelayer.api.operation;

import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.model.common.ApiResource;

public class PostOperation<T extends ApiResource> extends ApiOperation {

	private T payload;

	public PostOperation(String path) {
		super(path);
	}

	@Override
	public Method getMethod() {
		return Method.POST;
	}

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}

}
