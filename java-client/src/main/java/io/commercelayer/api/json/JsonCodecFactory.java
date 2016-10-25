package io.commercelayer.api.json;

public final class JsonCodecFactory {

	public static JsonCodec getJsonCodecInstance() {
		return new GsonCodec();
	}
	
	private JsonCodecFactory() {
		
	}
	
}
