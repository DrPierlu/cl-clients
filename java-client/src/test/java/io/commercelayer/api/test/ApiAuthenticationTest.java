package io.commercelayer.api.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import io.commercelayer.api.ApiAuthenticator;
import io.commercelayer.api.exception.AuthException;
import io.commercelayer.api.security.ApiAccount;
import io.commercelayer.api.security.ApiToken;
import io.commercelayer.api.test.common.TestConfig;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApiAuthenticationTest {
	
	private static ApiAuthenticator auth;
	private static ApiAccount account;
	
	@BeforeClass
	public static void initTests() {
		
		auth = new ApiAuthenticator();
		
		account = new ApiAccount();
		
		account.setUsername(TestConfig.getProperty("authentication.account.username"));
		account.setEnvironmentId(TestConfig.getProperty("authentication.account.environmentId"));
		account.setAuthKey(TestConfig.getProperty("authentication.account.authKey"));
		account.setAuthSecret(TestConfig.getProperty("authentication.account.authSecret"));
		
	}

	@Test
	public void authenticationTest() throws AuthException {
		
		ApiToken at = auth.authenticate(account);
		
		Assert.assertNotNull(at.getAccessToken());
		Assert.assertNotNull(at.getRefreshToken());
		
	}
	
	@Test
	public void refreshTokenTest() throws AuthException {
		
		ApiToken t = auth.authenticate(account);
		String accessToken = t.getAccessToken();
		ApiToken token = auth.refreshToken(account, t);
		
		Assert.assertNotNull(token.getAccessToken());
		Assert.assertNotEquals(token.getAccessToken(), accessToken);
		
	}
	
	
	public static void main(String[] args) throws AuthException {
		initTests();
		auth.authenticate(account);
	}
	
}
