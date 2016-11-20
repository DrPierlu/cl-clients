package io.commercelayer.api.exception;

import io.commercelayer.api.model.common.ApiError;

public class AuthException extends RuntimeException {

	private static final long serialVersionUID = -1264925746527362752L;

	public AuthException(String message) {
		super("Authentication Error: ".concat(message));
	}
	
	public AuthException(String message, Object... params) {
		super("Authentication Error: ".concat(String.format(message, params)));
	}
	
	public AuthException(ApiError apiError) {
		this("[" + apiError.getError() + " - " + apiError.getErrorDescription() + "]");
	}
	
}
