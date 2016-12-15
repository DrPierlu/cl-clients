package io.commercelayer.api;

import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.ApiOperation;

public class ApiRequest<T extends ApiOperation> {

	private T operation;
	private ApiResource resource;
	
	public ApiRequest() {
		super();
	}
	
	public ApiRequest(T operation, ApiResource resource) {
		this();
		this.operation = operation;
		this.resource = resource;
	}

	

	public T getOperation() {
		return operation;
	}

	public void setOperation(T operation) {
		this.operation = operation;
	}

	public ApiResource getResource() {
		return resource;
	}

	public void setResource(ApiResource resource) {
		this.resource = resource;
	}

}
