package io.commercelayer.api.operation;

import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.model.common.ApiResource;

public class GetOperation<T extends ApiResource> extends ApiOperation {

	private Class<T> responseObjectType;

	public GetOperation(String path) {
		super(path);
	}

	@Override
	public Method getMethod() {
		return Method.GET;
	}

	public Long getId() {
		return (Long) getPathParam("id");
	}

	public void setId(Long id) {
		addPathParam("id", id);
	}

	public Class<T> getResponseObjectType() {
		return responseObjectType;
	}

	public void setResponseObjectType(Class<T> responseObjectType) {
		this.responseObjectType = responseObjectType;
	}

}
