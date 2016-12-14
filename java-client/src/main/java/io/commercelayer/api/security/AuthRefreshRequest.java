package io.commercelayer.api.security;

import io.commercelayer.api.domain.AuthenticationDomain;
import io.commercelayer.api.model.common.ApiObject;

public class AuthRefreshRequest extends ApiObject implements AuthenticationDomain {

	private String grantType = GrantType.REFRESH_TOKEN;
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
