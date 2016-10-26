package io.commercelayer.api.security;

import java.time.LocalDateTime;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public final class ApiToken {

	@Expose
	@SerializedName("access_token")
	private String accessToken;
	@Expose
	@SerializedName("token_type")
	private String tokenType = "bearer";
	@Expose
	@SerializedName("expireIn")
	private int expiresIn;
	@Expose
	@SerializedName("refresh_token")
	private String refreshToken;

	private LocalDateTime expiresFrom;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public LocalDateTime getExpiresFrom() {
		return expiresFrom;
	}

	public void setExpiresFrom(LocalDateTime expiresFrom) {
		this.expiresFrom = expiresFrom;
	}

}
