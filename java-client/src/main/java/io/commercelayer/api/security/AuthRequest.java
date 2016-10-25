package io.commercelayer.api.security;

import com.google.gson.annotations.SerializedName;

public class AuthRequest {

	private ApiCredentials credentials;

	@SerializedName("grant_type")
	private String grantType = "password";
	@SerializedName("username")
	private String username;
	@SerializedName("password")
	private String password = "supersecret";
	@SerializedName("environment")
	private String environment;

	public AuthRequest(ApiCredentials credentials) {
		this.credentials = credentials;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public ApiCredentials getCredentials() {
		return credentials;
	}

}
