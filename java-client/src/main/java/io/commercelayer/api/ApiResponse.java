package io.commercelayer.api;

import io.commercelayer.api.model.common.ApiError;
import io.commercelayer.api.model.common.ApiResource;

public class ApiResponse<T extends ApiResource> {

	private T resource;
	private ApiError apiError;
	
	public ApiResponse() {
		super();
	}
	
	public ApiResponse(T resource) {
		this();
		this.resource = resource;
	}
	
	public ApiResponse(ApiError apiError) {
		this();
		this.apiError = apiError;
	}

	public T getResource() {
		return resource;
	}

	public void setResource(T resource) {
		this.resource = resource;
	}

	public ApiError getApiError() {
		return apiError;
	}
	
	public boolean hasError() {
		return (apiError != null);
	}
	
}
