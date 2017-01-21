package io.commercelayer.api.security;

public final class AuthPasswordRequest extends AuthRequest {

	private String username;
	private String environmentId;
	private String password = "supersecret";

	public AuthPasswordRequest(ApiAccount account) {
		super();
		this.username = account.getUsername();
		this.environmentId = account.getEnvironmentId();
	}

	public String getUsername() {
		return username;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String grantType() {
		return GrantType.PASSWORD;
	}

}
