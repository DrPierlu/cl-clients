package io.commercelayer.api.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.commercelayer.api.security.ApiAccount;
import io.commercelayer.api.security.ApiAuthenticator;
import io.commercelayer.api.security.ApiToken;

public class ApiAuthenticationTest {
	
	private static ApiAccount account;
	
	@BeforeClass
	public static void initTests() {
		
		account = new ApiAccount();
		account.setUsername("pierluigiviti@gmail.com");
		account.setAuthKey("8967838eed2ad96d2f7451dad6358112");
		account.setAuthSecret("9624e353b807bf2dffdb2855542fd28b6e1918e006800737b8a0d5dd6894a8a7");
		
	}

	@Test
	public void authenticationTest() {
		
		ApiToken at = ApiAuthenticator.authenticate(account);
		
		Assert.assertNotNull(at.getAccessToken());
		Assert.assertNotNull(at.getRefreshToken());
		
	}
	
	@Test
	public void refreshTokenTest() {
		
		ApiToken t = ApiAuthenticator.authenticate(account);
		String accessToken = t.getAccessToken();
		ApiToken token = ApiAuthenticator.refreshToken(account, t);
		
		Assert.assertNotNull(token.getAccessToken());
		Assert.assertNotEquals(token.getAccessToken(), accessToken);
		
		
	}
	
}
