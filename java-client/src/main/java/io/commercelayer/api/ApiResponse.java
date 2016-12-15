package io.commercelayer.api;

import io.commercelayer.api.model.common.ApiResource;

public class ApiResponse<T extends ApiResource> {

	private T apiResource;
	
	public ApiResponse() {
		super();
	}
	
	public ApiResponse(T resource) {
		this();
		this.apiResource = resource;
	}

	public T getApiResource() {
		return apiResource;
	}

	public void setApiResource(T apiResource) {
		this.apiResource = apiResource;
	}
	
}
