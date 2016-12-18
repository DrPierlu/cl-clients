package io.commercelayer.api.json;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public final class JsonCodecProvider {

	private static final ServiceLoader<JsonCodec> serviceLoader = ServiceLoader.load(JsonCodec.class);
	
	private JsonCodecProvider() {
		super();
	}
	
	public static List<String> getProviders() {
		List<String> providers = new ArrayList<>();
		for (JsonCodec c : serviceLoader) {
			providers.add(c.getClass().getName());
		}
		return providers;
	}
	
	public static void main(String[] args) {
		for (String s : getProviders()) System.out.println(s);
	}
	
}
