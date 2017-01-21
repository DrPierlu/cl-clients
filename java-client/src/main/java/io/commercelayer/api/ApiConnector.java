package io.commercelayer.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.http.HttpClient;
import io.commercelayer.api.http.HttpClientFactory;
import io.commercelayer.api.json.JsonCodec;
import io.commercelayer.api.json.JsonCodecFactory;

public abstract class ApiConnector {
	
	Logger logger = LoggerFactory.getLogger(getClass());

	HttpClient httpClient;
	JsonCodec jsonCodec;

	
	public ApiConnector() {
		super();
		this.httpClient = HttpClientFactory.getHttpClientInstance();
		this.jsonCodec = JsonCodecFactory.getJsonCodecInstance();
	}
	
	void useJsonCodec(JsonCodec jsonCodec) {
		this.jsonCodec = jsonCodec;
	}
	
	void useHttpClient(HttpClient httpClient) {
		this.httpClient = httpClient;
	}
	
}
