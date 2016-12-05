package io.commercelayer.api;

import io.commercelayer.api.model.common.ApiResource;

public class ApiRequest {

	private String path;
	private ApiResource resource;
	
	public ApiRequest() {
		super();
	}
	
	public ApiRequest(String path, ApiResource resource) {
		this();
		this.path = path;
		this.resource = resource;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public ApiResource getResource() {
		return resource;
	}

	public void setResource(ApiResource resource) {
		this.resource = resource;
	}

}
