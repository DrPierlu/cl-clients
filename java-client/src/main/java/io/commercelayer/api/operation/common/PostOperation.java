package io.commercelayer.api.operation.common;

import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.model.common.ApiResource;

public class PostOperation extends ApiOperation {

	private ApiResource payload;

	protected PostOperation(String path) {
		super(path);
	}

	@Override
	public Method getMethod() {
		return Method.POST;
	}

	public ApiResource getPayload() {
		return payload;
	}

	public void setPayload(ApiResource payload) {
		this.payload = payload;
	}

}
