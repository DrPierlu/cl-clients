package io.commercelayer.api.security;

import io.commercelayer.api.http.auth.HttpAuthBasic;

public class AuthClientRequest extends AuthRequest {

	public AuthClientRequest(ApiApplication application) {
		
		super();
		
		this.environmentId = application.getEnvironmentId();
		
		setHttpAuth(new HttpAuthBasic(application));
		
	}


	@Override
	public String grantType() {
		return GrantType.CLIENT_CREDENTIALS;
	}

}
