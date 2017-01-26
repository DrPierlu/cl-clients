package io.commercelayer.api.security;

import io.commercelayer.api.http.auth.HttpAuthBasic;

public final class AuthPasswordRequest extends AuthRequest {

	private String username;
	private String password = "supersecret";


	public AuthPasswordRequest(ApiAccount account) {
		
		super();
		
		this.username = account.getUsername();
		if (account.getPassword() != null) this.password = account.getPassword();
		this.environmentId = account.getEnvironmentId();
		
		setHttpAuth(new HttpAuthBasic(account));
		
	}


	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}


	@Override
	public String grantType() {
		return GrantType.PASSWORD;
	}

}
