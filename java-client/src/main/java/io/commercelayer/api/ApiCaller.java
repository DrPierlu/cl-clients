package io.commercelayer.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.http.HttpClient;
import io.commercelayer.api.http.HttpClientFactory;
import io.commercelayer.api.http.HttpException;
import io.commercelayer.api.http.HttpRequest;
import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.http.HttpResponse;
import io.commercelayer.api.json.JsonCodec;
import io.commercelayer.api.json.JsonCodecFactory;
import io.commercelayer.api.model.common.BasicResource;
import io.commercelayer.api.security.ApiToken;
import io.commercelayer.api.security.AuthException;
import io.commercelayer.api.util.ContentType;

public abstract class ApiCaller<T extends BasicResource> {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	private ApiToken apiToken;
	
	private final HttpClient httpClient;
	private final JsonCodec jsonCodec;

	public ApiCaller() {
		this.httpClient = HttpClientFactory.getHttpClientInstance();
		this.jsonCodec = JsonCodecFactory.getJsonCodecInstance();
	}
	
	public ApiCaller(HttpClient httpClient) {
		this.httpClient = (httpClient == null)? HttpClientFactory.getHttpClientInstance() : httpClient;
		this.jsonCodec = JsonCodecFactory.getJsonCodecInstance();
	}
	

	public void setApiToken(ApiToken apiToken) {
		this.apiToken = apiToken;
	}
	
	


	public List<T> getItemList() throws ApiException {

		HttpRequest request = createHttpRequest(Method.GET);

		HttpResponse response = call(request);

		return null;

	}

	public void saveItemList(List<T> itemList) throws ApiException {

		HttpRequest request = createHttpRequest(Method.PUT);

		HttpResponse response = call(request);

	}

	public T getItem(String id) throws ApiException {

		HttpRequest request = createHttpRequest(Method.GET);

		HttpResponse response = call(request);

		return null;

	}
	
	
	public void updateItem(T item) throws ApiException {

		HttpRequest request = createHttpRequest(Method.PUT);

		HttpResponse response = call(request);

	}

	public void deleteItem(String id) throws ApiException {

		HttpRequest request = createHttpRequest(Method.DELETE);

		HttpResponse response = call(request);

	}

	public void deleteItem(T item) throws ApiException {
		deleteItem(item.getId());
	}

	
	private HttpResponse call(HttpRequest request) throws ApiException, AuthException {

		if ((apiToken == null) || apiToken.getAccessToken() == null)
			throw new AuthException("No access_token defined");
		
		try {

			HttpResponse response = httpClient.send(request);
			
			return response;

		} catch (HttpException he) {
			throw new ApiException();
		}

	}

	
	private HttpRequest createHttpRequest(Method httpMethod) {

		HttpRequest request = new HttpRequest(httpMethod);

		request.setContentType(ContentType.JSON);
		request.addHeader("Accept", ContentType.JSON);
		request.addHeader("Authorization", "Bearer " + apiToken.getAccessToken());

		return request;

	}	
	
}
