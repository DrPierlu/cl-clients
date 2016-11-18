package io.commercelayer.api.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.config.ApiConfig.Group;
import io.commercelayer.api.security.ApiAccount;
import io.commercelayer.api.security.ApiAuthenticator;
import io.commercelayer.api.security.ApiToken;

public class ApiAuthenticationTest {
	
	private static ApiAuthenticator auth;
	private static ApiAccount account;
	
	@BeforeClass
	public static void initTests() {
		
		auth = new ApiAuthenticator();
		
		account = new ApiAccount();
		
		account.setUsername(ApiConfig.getProperty(Group.authentication, "username"));
		account.setEnvironment(ApiConfig.getProperty(Group.authentication, "environment"));
		account.setAuthKey(ApiConfig.getProperty(Group.authentication, "authKey"));
		account.setAuthSecret(ApiConfig.getProperty(Group.authentication, "authSecret"));
		
	}

	@Test
	public void authenticationTest() {
		
		ApiToken at = auth.authenticate(account);
		
		Assert.assertNotNull(at.getAccessToken());
		Assert.assertNotNull(at.getRefreshToken());
		
	}
	
	@Test
	public void refreshTokenTest() {
		
		ApiToken t = auth.authenticate(account);
		String accessToken = t.getAccessToken();
		ApiToken token = auth.refreshToken(account, t);
		
		Assert.assertNotNull(token.getAccessToken());
		Assert.assertNotEquals(token.getAccessToken(), accessToken);
		
	}
	
	
	public static void main(String[] args) {
		initTests();
		auth.authenticate(account);
	}
	
}
