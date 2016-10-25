package io.commercelayer.api.http;

public final class HttpClientFactory {

	public static HttpClient getHttpClientInstance() {
		return new HttpClientOkHttpImpl();
	}
	
	private HttpClientFactory() {
		
	}
	
}
