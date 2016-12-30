package io.commercelayer.api.security;

import io.commercelayer.api.model.common.ApiObject;

public class AuthRefreshRequest extends ApiObject implements AuthRequest {

	private String refreshToken;

	public AuthRefreshRequest(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	
	public AuthRefreshRequest(ApiToken token) {
		this.refreshToken = token.getRefreshToken();
	}
	
	public String getRefreshToken() {
		return refreshToken;
	}

	@Override
	public String getGrantType() {
		return GrantType.REFRESH_TOKEN;
	}

}
