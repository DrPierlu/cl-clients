package io.commercelayer.api.test;

import org.junit.Assert;
import org.junit.Test;

import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.config.ApiConfig.Group;

public class ApiConfigTest {

	@Test
	public void loadConfigTest() {
		String value = ApiConfig.getProperty(Group.test, "key");
		Assert.assertEquals("value", value);
	}
	
}
