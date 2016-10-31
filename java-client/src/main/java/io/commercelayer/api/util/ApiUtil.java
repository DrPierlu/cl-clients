package io.commercelayer.api.util;

import io.commercelayer.api.json.JsonCodec;
import io.commercelayer.api.json.JsonCodecFactory;

public final class ApiUtil {
	
	private static final JsonCodec jsonCodec = JsonCodecFactory.getJsonCodecInstance();
	
	public static JsonCodec getJsonCodecInstance() {
		return jsonCodec;
	}

}
