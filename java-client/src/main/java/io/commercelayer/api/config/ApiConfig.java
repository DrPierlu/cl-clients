package io.commercelayer.api.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.util.LogUtils;

public final class ApiConfig {
	
	private static final Logger logger = LoggerFactory.getLogger(ApiConfig.class);
	
	public static enum Group {
		api, test, authentication, http
	}
	
	private static Properties settings = new Properties();
	
	static {
		loadConfiguration();
	}
	
	
	private static void loadConfiguration() {
		
		InputStream configStrieam = ClassLoader.class.getResourceAsStream("/META-INF/settings.properties");
		
		try {
			settings.load(configStrieam);
		} catch (IOException ioe) {
			logger.error(LogUtils.printStackTrace(ioe));
		}
		
	}


	
	public static String getProperty(String key) {
		return (key == null)? null : settings.getProperty(key);
	}
	
	public static String getProperty(Group group, String key) {
		return getProperty(group.name() + '.' + key);
	}
	
	public static Boolean isPropertyEnabled(String key) {
		return Boolean.valueOf(getProperty(key));
	}
	
	public static Boolean isPropertyEnabled(Group group, String key) {
		return Boolean.valueOf(getProperty(group, key));
	}
	
	public static boolean testModeEnabled() {
		return ApiConfig.isPropertyEnabled(Group.test, "mode");
	}

}
