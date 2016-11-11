package io.commercelayer.api.test;

import org.junit.BeforeClass;

import io.commercelayer.api.security.ApiAccount;
import io.commercelayer.api.security.ApiAuthenticator;
import io.commercelayer.api.security.ApiToken;

public abstract class ApiTest {
	
	protected static ApiAccount account;
	protected static ApiToken token;
	
	@BeforeClass
	public static void initTests() {
		
		if (token != null) {
			System.out.println("Api Token già inizializzato");
			return;
		}
		
		account = new ApiAccount();
		account.setUsername("pierluigiviti@gmail.com");
		account.setAuthKey("8967838eed2ad96d2f7451dad6358112");
		account.setAuthSecret("9624e353b807bf2dffdb2855542fd28b6e1918e006800737b8a0d5dd6894a8a7");
		
		token = new ApiAuthenticator().authenticate(account);
		
	}

}
