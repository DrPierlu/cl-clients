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
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.model.common.BasicResource;
import io.commercelayer.api.security.ApiToken;
import io.commercelayer.api.security.AuthException;
import io.commercelayer.api.util.ContentType;

public abstract class ApiCaller {
	
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
	
	


	protected <T> List<T> getItemList() throws ApiException {

		HttpRequest request = createHttpRequest(Method.GET);

		HttpResponse response = call(request);

		return null;

	}

	protected void saveItemList(List<? extends ApiResource> itemList) throws ApiException {

		HttpRequest request = createHttpRequest(Method.PUT);

		HttpResponse response = call(request);

	}

	protected <T> T getItem(String id, Class<T> class_) throws ApiException {

		HttpRequest request = createHttpRequest(Method.GET);

		HttpResponse response = call(request);

		return null;

	}
	
	
	protected void updateItem(ApiResource item) throws ApiException {

		HttpRequest request = createHttpRequest(Method.PUT);

		HttpResponse response = call(request);

	}

	protected void deleteItem(String id) throws ApiException {

		HttpRequest request = createHttpRequest(Method.DELETE);

		HttpResponse response = call(request);

	}

	protected void deleteItem(BasicResource item) throws ApiException {
		deleteItem(item.getId());
	}

	
	private HttpResponse call(HttpRequest request) throws ApiException, AuthException {

		if ((apiToken == null) || apiToken.getAccessToken() == null)
			throw new AuthException("No access_token defined");
		
		try {

			HttpResponse response = httpClient.send(request);
			
			return response;

		} catch (HttpException he) {
			logger.error("HTTP Error: {}", he.getMessage());
			throw new ApiException("Error calling CommerceLayer API");
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
