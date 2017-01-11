package io.commercelayer.api;

import io.commercelayer.api.model.common.ApiResource;

public class ApiResponse<T extends ApiResource> {

	private T resource;
		
	
	public ApiResponse(T resource) {
		super();
		this.resource = resource;
	}

	public T getResource() {
		return resource;
	}

	public void setResource(T resource) {
		this.resource = resource;
	}
	
}
