package io.commercelayer.api.security;

import io.commercelayer.api.domain.Authentication;
import io.commercelayer.api.http.auth.HttpAuth;
import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiObject;

public abstract class AuthRequest extends ApiObject implements Authentication {

	protected String environmentId;
	private String grantType;
	@JsonExclude
	private HttpAuth httpAuth;


	AuthRequest() {
		this.grantType = grantType();
	}


	protected abstract String grantType();


	public String getGrantType() {
		return this.grantType;
	}


	protected void setGrantType(String grantType) {
		this.grantType = grantType;
	}


	public String getEnvironmentId() {
		return environmentId;
	}


	protected void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}


	public void setHttpAuth(HttpAuth httpAuth) {
		this.httpAuth = httpAuth;
	}


	public HttpAuth getHttpAuth() {
		return httpAuth;
	}

}
