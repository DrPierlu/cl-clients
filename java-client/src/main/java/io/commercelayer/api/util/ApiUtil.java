package io.commercelayer.api.util;

import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.json.JsonCodec;
import io.commercelayer.api.json.JsonCodecFactory;

public final class ApiUtil {
	
	private static final JsonCodec jsonCodec = JsonCodecFactory.getJsonCodecInstance();
	
	public static JsonCodec getJsonCodecInstance() {
		return jsonCodec;
	}
	
	public static String getResourceUrl(String resource) {
		return ApiConfig.getProperty("api.service.url").concat(resource);
	}
	
}
