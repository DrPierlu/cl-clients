package io.commercelayer.api.security;

import io.commercelayer.api.domain.Authentication;
import io.commercelayer.api.model.common.ApiObject;

public abstract class AuthObject extends ApiObject implements Authentication {

	private transient String authKey;
	private transient String authSecret;
	protected String environmentId = Environment.DEVELOPMENT;

	
	public AuthObject() {
		super();
	}
	
	public AuthObject(String authKey, String authSecret, String environmentId) {
		this();
		this.authKey = authKey;
		this.authSecret = authSecret;
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


	public String getEnvironmentId() {
		return environmentId;
	}


	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}

}
