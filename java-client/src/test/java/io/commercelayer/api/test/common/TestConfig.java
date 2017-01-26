package io.commercelayer.api.test.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.util.LogUtils;

public final class TestConfig {
	
	private static final Logger logger = LoggerFactory.getLogger(TestConfig.class);
	
	private static Properties settings = new Properties();
	
	static {
		loadConfiguration();
	}
	
	
	private static void loadConfiguration() {
		
		InputStream configStream = TestConfig.class.getResourceAsStream("test.properties");
		
		try {
			settings.load(configStream);
		} catch (IOException ioe) {
			logger.error(LogUtils.printStackTrace(ioe));
		}
		
	}


	
	public static String getProperty(String key) {
		return (key == null)? null : settings.getProperty(key);
	}
	
	public static Boolean isPropertyEnabled(String key) {
		return Boolean.valueOf(getProperty(key));
	}
	
}
