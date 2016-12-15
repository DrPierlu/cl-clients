package io.commercelayer.api;

import io.commercelayer.api.model.common.ApiResource;

public class ApiResponse {

	private ApiResource apiResource;
	
	public ApiResponse() {
		super();
	}
	
	public ApiResponse(ApiResource resource) {
		this();
		this.apiResource = resource;
	}

	public ApiResource getApiResource() {
		return apiResource;
	}

	public void setApiResource(ApiResource apiResource) {
		this.apiResource = apiResource;
	}

}
