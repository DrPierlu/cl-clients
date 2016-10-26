package io.commercelayer.api.security;

public class AuthException extends RuntimeException {

	private static final long serialVersionUID = -1264925746527362752L;

	public AuthException(String message) {
		super(message);
	}

}
