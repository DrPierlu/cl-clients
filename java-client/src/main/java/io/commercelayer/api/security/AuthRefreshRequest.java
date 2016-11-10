package io.commercelayer.api.security;

import io.commercelayer.api.model.common.ApiResource;

public class AuthRefreshRequest extends ApiResource {

	private String grantType = "refresh_token";
	private String refreshToken;

	public AuthRefreshRequest(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	
	public AuthRefreshRequest(ApiToken token) {
		this.refreshToken = token.getRefreshToken();
	}
	
	public String getGrantType() {
		return grantType;
	}
	
	public String getRefreshToken() {
		return refreshToken;
	}

}
