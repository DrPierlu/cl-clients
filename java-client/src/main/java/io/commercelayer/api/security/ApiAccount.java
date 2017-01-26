package io.commercelayer.api.security;

import java.util.Objects;

public class ApiAccount extends AuthObject {

	private String username;
	private String password;


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
	public boolean equals(Object o) {

		if (this == o) return true;
		if (o == null) return false;
		if (!(o instanceof ApiAccount)) return false;

		ApiAccount aa = (ApiAccount)o;
		return Objects.equals(this.username, aa.username) && Objects.equals(this.environmentId, aa.environmentId);

	}


	@Override
	public int hashCode() {
		return Objects.hash(this.username, this.environmentId);
	}

}
