package io.commercelayer.api.domain;

public interface AuthenticationDomain {
	
	public static interface Environment {
		String DEVELOPMENT 		= "4";
	}
	
	public static interface TokenType {
		String BEARER 			= "bearer";
	}
	
	public static interface GrantType {
		String PASSWORD 		= "password";
		String REFRESH_TOKEN 	= "refresh_token";
	}

}
