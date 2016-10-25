package io.commercelayer.api.http;

public final class HttpException extends Exception {

	private static final long serialVersionUID = -8796967647553222979L;
	
	public HttpException(String message) {
		super(message);
	}
	
	public HttpException(Throwable cause) {
		super(cause);
	}
	
	public HttpException(String message, Throwable cause) {
		super(message, cause);
	}

}
