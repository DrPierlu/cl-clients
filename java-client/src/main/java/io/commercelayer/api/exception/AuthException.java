package io.commercelayer.api.exception;

import io.commercelayer.api.model.common.ApiError;

public class AuthException extends ApiException {

	private static final long serialVersionUID = -1264925746527362752L;

	
	public AuthException(ApiError apiError) {
		super(apiError);
	}
	
}
