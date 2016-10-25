package io.commercelayer.api.security;

public class ApiCredentials implements BasicAuth {

	private String authKey;
	private String authSecret;

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public String getAuthSecret() {
		return authSecret;
	}

	public void setAuthSecret(String authSecret) {
		this.authSecret = authSecret;
	}

	@Override
	public String getUsername() {
		return getAuthKey();
	}

	@Override
	public String getPassword() {
		return getAuthSecret();
	}

}
