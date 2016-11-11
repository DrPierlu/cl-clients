package io.commercelayer.api.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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
		account.setUsername("pierluigiviti@gmail.com");
		account.setAuthKey("8967838eed2ad96d2f7451dad6358112");
		account.setAuthSecret("9624e353b807bf2dffdb2855542fd28b6e1918e006800737b8a0d5dd6894a8a7");
		
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
	
}
