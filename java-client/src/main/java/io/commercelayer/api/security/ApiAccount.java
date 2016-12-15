package io.commercelayer.api.security;

import java.util.Objects;

import io.commercelayer.api.domain.Authentication;
import io.commercelayer.api.model.common.ApiObject;

public class ApiAccount extends ApiObject implements Authentication {

	private String username;
	private String environmentId = Environment.DEVELOPMENT;
	private transient String authKey;
	private transient String authSecret;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEnvironmentId() {
		return environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
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
		return Objects.equals(this.username, aa.username) && Objects.equals(this.environmentId, aa.environmentId);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.username, this.environmentId);
	}

}
