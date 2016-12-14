package io.commercelayer.api.operation;

import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.model.common.ApiResource;

public class GetOperation<T extends ApiResource> extends ApiOperation {

	private Class<T> responseObjectType;

	public GetOperation(String path) {
		super(path);
	}
	
	public GetOperation(String path, Class<T> responseObjectType) {
		super(path);
		this.responseObjectType = responseObjectType;
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

}
