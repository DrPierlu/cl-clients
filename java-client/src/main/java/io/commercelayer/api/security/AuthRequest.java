package io.commercelayer.api.security;

import io.commercelayer.api.domain.Authentication;
import io.commercelayer.api.http.auth.HttpAuth;
import io.commercelayer.api.json.JsonExclude;
import io.commercelayer.api.model.common.ApiObject;

public abstract class AuthRequest extends ApiObject implements Authentication {

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

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}
	
	public void setHttpAuth(HttpAuth httpAuth) {
		this.httpAuth = httpAuth;
	}

	public HttpAuth getHttpAuth() {
		return httpAuth;
	}
	
}
