package io.commercelayer.api.test;

import java.util.Random;

import org.apache.commons.lang3.StringUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.config.ApiConfig.Group;
import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.security.ApiAccount;
import io.commercelayer.api.security.ApiAuthenticator;
import io.commercelayer.api.security.ApiToken;

public abstract class ApiTest {
	
	protected static final Random random = new Random(System.currentTimeMillis());
	
	protected static ApiAccount account;
	protected static ApiToken token;
	
	@BeforeClass
	public static void initTests() {
		
		if (token != null) {
			System.out.println("Api Token già inizializzato");
			return;
		}
		
		account = new ApiAccount();
		account.setUsername(ApiConfig.getProperty(Group.authentication, "username"));
		account.setEnvironment(ApiConfig.getProperty(Group.authentication, "environment"));
		account.setAuthKey(ApiConfig.getProperty(Group.authentication, "authKey"));
		account.setAuthSecret(ApiConfig.getProperty(Group.authentication, "authSecret"));
		
		token = new ApiAuthenticator().authenticate(account);
		
	}
	
	@Test
	public abstract void runTest() throws ApiException;
	
	public int randomValue() {
		return random.nextInt(1000);
	}
	
	public String randomString() {
		return StringUtils.leftPad(String.valueOf(randomValue()), 6, '0');
	}

	public String randomField(String field) {
		if (field == null) return field;
		else {
			if (!StringUtils.isEmpty(field)) field = field.concat("_");
			return field.concat(randomString());
		}
	}
	
}
