package io.commercelayer.api.security;

import java.util.Objects;

import io.commercelayer.api.model.common.ApiResource;

public class ApiAccount extends ApiResource {

	private String username;
	private String environment = "development";
	private transient String authKey;
	private transient String authSecret;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

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
	public boolean equals(Object o) {
		
		if (this == o) return true;
		if (o == null) return false;
		if (!(o instanceof ApiAccount)) return false;
		
		ApiAccount aa = (ApiAccount)o;
		return Objects.equals(this.username, aa.username) && Objects.equals(this.environment, aa.environment);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.username, this.environment);
	}

}
