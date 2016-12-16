package io.commercelayer.api.security;

import java.time.LocalDateTime;

import io.commercelayer.api.domain.Authentication;
import io.commercelayer.api.model.common.ApiObject;

public final class ApiToken extends ApiObject implements Authentication {

	private String accessToken;
	private String tokenType = TokenType.BEARER;
	private int expiresIn;
	private String refreshToken;

	private LocalDateTime releaseDate;
	
	ApiToken() {
		super();
	}

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

	public LocalDateTime getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDateTime releaseDate) {
		this.releaseDate = releaseDate;
	}

}
