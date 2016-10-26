package io.commercelayer.api.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class ApiConfig {
	
	public static enum Group {
		test, authentication
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
			ioe.printStackTrace();
		}
		
	}
	
	
	public static String getProperty(String key) {
		return (key == null)? null : settings.getProperty(key);
	}
	
	public static String getProperty(Group group, String key) {
		return (key == null)? null : settings.getProperty(group.name() + '.' + key);
	}

}
