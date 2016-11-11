package io.commercelayer.api.security;

import io.commercelayer.api.ApiError;

public class AuthException extends RuntimeException {

	private static final long serialVersionUID = -1264925746527362752L;

	public AuthException(String message) {
		super("Authentication Error: ".concat(message));
	}
	
	public AuthException(ApiError apiError) {
		this("[" + apiError.getError() + " - " + apiError.getErrorDescription() + "]");
	}
	
}
