package io.commercelayer.api.test;

import org.junit.Assert;
import org.junit.Test;

import io.commercelayer.api.config.ApiConfig;

public class ApiConfigTest {

	@Test
	public void loadConfigTest() {
		String value = ApiConfig.getProperty("test.key");
		Assert.assertEquals("value", value);
	}
	
}
