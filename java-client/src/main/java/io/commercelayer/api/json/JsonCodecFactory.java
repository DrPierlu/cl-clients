package io.commercelayer.api.json;

import org.apache.commons.lang3.StringUtils;

import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.config.ApiConfig.Group;
import io.commercelayer.api.util.LogUtils;

public final class JsonCodecFactory {
	
static {
		
		String cusomCodecImpl = ApiConfig.getProperty(Group.json, "codec.custom.impl");
		if (StringUtils.isNotBlank(cusomCodecImpl)) {
			try {
				customCodecClass = Class.forName(cusomCodecImpl);
			}
			catch (ClassNotFoundException cnfe) {
				LogUtils.singleErrorMessage(JsonCodecFactory.class, String.format("HTTP Custom JSON Codec class not found [%s]", cusomCodecImpl));
			}
		}
		
	}
	
	private static Class<?> customCodecClass;

	public static JsonCodec getJsonCodecInstance() {
		if (customCodecClass != null) return getCustomCodecInstance();
		else return new JsonCodecGsonImpl();
	}
	
	private static JsonCodec getCustomCodecInstance() {
		JsonCodec codec = null;
		try {
			codec = (JsonCodec)customCodecClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			LogUtils.singleErrorStackTrace(JsonCodecFactory.class, e);
		}
		return codec;
	}
	
	private JsonCodecFactory() {
		
	}
	
	
	public static void main(String[] args) {
		JsonCodec client = JsonCodecFactory.getJsonCodecInstance();
		LogUtils.singleInfoMessage(JsonCodecFactory.class, String.format("HTTP JSON Codec implementation: %s", client.getClass().getName()));
	}
	
}
