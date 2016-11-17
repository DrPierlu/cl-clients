package io.commercelayer.api.exception;

import io.commercelayer.api.ApiError;

public final class ApiException extends Exception {

	private static final long serialVersionUID = -7947726126234188811L;
	
	private ApiError apiError;
	
	public ApiException(ApiError apiError) {
		super(apiError.toString());
		this.apiError = apiError;
	}

	public ApiError getApiError() {
		return apiError;
	}

}