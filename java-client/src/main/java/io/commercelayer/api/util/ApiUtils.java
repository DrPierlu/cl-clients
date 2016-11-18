package io.commercelayer.api.util;

import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.config.ApiConfig.Group;
import io.commercelayer.api.json.JsonCodec;
import io.commercelayer.api.json.JsonCodecFactory;
import io.commercelayer.api.model.Address;

public final class ApiUtils {
	
	private static final JsonCodec jsonCodec = JsonCodecFactory.getJsonCodecInstance();
	
	public static JsonCodec getJsonCodecInstance() {
		return jsonCodec;
	}
	
	public static String formatJson(String json) {
		JsonCodec jc = getJsonCodecInstance();
		return jc.toJSON(jc.fromJSON(json, Address.class), false);
	}
	
	public static String getResourceUrl(String resource) {
		return ApiConfig.getProperty(Group.api, "service.url").concat(resource);
	}
	
}
