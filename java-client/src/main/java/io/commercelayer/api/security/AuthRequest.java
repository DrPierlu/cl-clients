package io.commercelayer.api.security;

import io.commercelayer.api.json.JsonUtil;

public final class AuthRequest extends ApiAccount {

	private String grantType = "password";
	private String password = "supersecret";

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public static void main(String[] args) {
		
		AuthRequest request = new AuthRequest();
		request.setUsername("user@server.com");
		request.setAuthKey("test_authKey");
		request.setAuthSecret("test_authSecret");
		request.setEnvironment("test_environment");
		request.setGrantType("test_grantType");
		request.setPassword("test_password");
		
		System.out.println(JsonUtil.toJSON(request));
		
	}

}
