package io.commercelayer.api.json.gson;

import io.commercelayer.api.json.JsonCodec;

public final class JsonCodecGsonFactory {

	private JsonCodecGsonFactory() {
		super();
	}
	
	public static JsonCodec newJsonCodecInstance() {
		return new JsonCodecGsonImpl();
	}
	
}
