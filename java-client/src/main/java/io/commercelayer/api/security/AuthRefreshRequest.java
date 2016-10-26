package io.commercelayer.api.security;

import com.google.gson.annotations.SerializedName;

public class AuthRefreshRequest {

	@SerializedName("grant_type")
	private String grantType = "refresh_token";
	@SerializedName("refresh_token")
	private String refreshToken;

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

}