package io.commercelayer.api.security;

public class AuthRefreshRequest extends AuthRequest {

	private String refreshToken;

	public AuthRefreshRequest(String refreshToken) {
		super();
		this.refreshToken = refreshToken;
	}
	
	public AuthRefreshRequest(ApiToken token) {
		this(token.getRefreshToken());
	}
	
	public String getRefreshToken() {
		return refreshToken;
	}

	@Override
	public String grantType() {
		return GrantType.REFRESH_TOKEN;
	}

}
