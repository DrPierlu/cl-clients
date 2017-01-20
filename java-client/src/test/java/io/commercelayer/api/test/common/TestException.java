package io.commercelayer.api.test.common;

import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.model.common.ApiError;

public class TestException extends RuntimeException {

	private static final long serialVersionUID = 590592317194844007L;
	
	private ApiError error;
	
	public TestException(String message) {
		super(message);
	}

	public TestException(ApiError error, String message) {
		this(message);
		this.error = error;
	}
	
	public TestException(ApiException exception) {
		this(exception.getApiError(), exception.getApiErrorInfo());
	}
	
	public ApiError getError() {
		return this.error;
	}
	
	public boolean causedByApiError() {
		return (this.error != null);
	}
	
}
