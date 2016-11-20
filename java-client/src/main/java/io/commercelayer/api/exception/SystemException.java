package io.commercelayer.api.exception;

public class SystemException extends RuntimeException {

	private static final long serialVersionUID = 5979503396002964089L;

	public SystemException(String message) {
		super(message);
	}
	
	public SystemException(String message, Object... params) {
		super(String.format(message, params));
	}
	
}
