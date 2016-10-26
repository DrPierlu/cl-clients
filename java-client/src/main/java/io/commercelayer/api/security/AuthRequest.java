package io.commercelayer.api.security;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.commercelayer.api.json.JsonUtil;

public final class AuthRequest extends ApiAccount {

	@Expose @SerializedName("grant_type")
	private String grantType = "password";
	@Expose @SerializedName("password")
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
		
		System.out.println(JsonUtil.toJSON(request));
		
	}

}
