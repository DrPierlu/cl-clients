package io.commercelayer.api;

import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.ApiOperation;

public class ApiRequest<T extends ApiOperation<? extends ApiResource>> {

	private T operation;
	
	public ApiRequest() {
		super();
	}
	
	public ApiRequest(T operation) {
		this();
		this.operation = operation;
	}

	

	public T getOperation() {
		return operation;
	}

	public void setOperation(T operation) {
		this.operation = operation;
	}
	
	public String toString() {
		return getClass().getSimpleName();
	}

}
