package io.commercelayer.api.operation;

import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.model.common.ApiResource;

public class PutOperation<T extends ApiResource> extends ApiOperation {

	private T payload;

	public PutOperation(String path) {
		super(path);
	}

	@Override
	public Method getMethod() {
		return Method.PUT;
	}

	public Long getId() {
		return (Long)getPathParam("id");
	}

	public void setId(Long id) {
		addPathParam("id", id);
	}

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}

}
