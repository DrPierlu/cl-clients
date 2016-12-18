package io.commercelayer.api.http;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public final class HttpClientProvider {
	
	private static ServiceLoader<HttpClient> serviceLoader = ServiceLoader.load(HttpClient.class);

	private HttpClientProvider() {
		super();
	}
	
	public static List<String> getProviders() {
		List<String> providers = new ArrayList<>();
		for (HttpClient c : serviceLoader) {
			providers.add(c.getClass().getName());
		}
		return providers;
	}
	
	public static void main(String[] args) {
		for (String s : getProviders()) System.out.println(s);
	}
	
}
