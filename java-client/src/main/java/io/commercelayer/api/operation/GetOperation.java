package io.commercelayer.api.operation;

import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.model.common.ApiResource;

public abstract class GetOperation extends ApiOperation {
	
	private Class<? extends ApiResource> responseObjectType;

	public GetOperation(String path) {
		super(path);
	}
	
	public GetOperation(String path, Class<? extends ApiResource> responseObjectType) {
		this(path);
		this.responseObjectType = responseObjectType;
	}
		

	@Override
	public Method getMethod() {
		return Method.GET;
	}
	
	public Class<? extends ApiResource> getResponseObjectType() {
		return responseObjectType;
	}

}
