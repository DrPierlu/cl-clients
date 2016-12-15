package io.commercelayer.api.security;

import io.commercelayer.api.domain.Authentication;

public final class AuthRequest extends ApiAccount implements Authentication {

	private String grantType = GrantType.PASSWORD;
	private String password = "supersecret";

	public AuthRequest(ApiAccount account) {
		super.setUsername(account.getUsername());
		super.setEnvironmentId(account.getEnvironmentId());
		super.setAuthKey(account.getAuthKey());
		super.setAuthSecret(account.getAuthSecret());
	}
	
	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
