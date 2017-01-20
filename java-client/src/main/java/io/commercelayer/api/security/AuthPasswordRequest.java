package io.commercelayer.api.security;

public final class AuthPasswordRequest extends ApiAccount implements AuthRequest {

	private String password = "supersecret";
	private String grantType = GrantType.PASSWORD;

	public AuthPasswordRequest(ApiAccount account) {
		super.setUsername(account.getUsername());
		super.setEnvironmentId(account.getEnvironmentId());
		super.setAuthKey(account.getAuthKey());
		super.setAuthSecret(account.getAuthSecret());
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String getGrantType() {
		return this.grantType;
	}
	
}
