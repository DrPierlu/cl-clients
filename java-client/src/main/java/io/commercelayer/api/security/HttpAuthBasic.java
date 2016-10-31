package io.commercelayer.api.security;

public class HttpAuthBasic implements HttpAuth {

	private String username;
	private String password;
	
	public HttpAuthBasic(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getHttpRequestAuthHeader() {
		// TODO Auto-generated method stub
		return null;
	}

}
