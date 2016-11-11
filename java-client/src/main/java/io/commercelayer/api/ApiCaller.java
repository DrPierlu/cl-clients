package io.commercelayer.api;

import java.util.List;

import javax.xml.ws.http.HTTPException;

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
import io.commercelayer.api.util.ApiUtil;
import io.commercelayer.api.util.ContentType;

public abstract class ApiCaller {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	private final ApiToken apiToken;
	
	private HttpClient httpClient;
	private final JsonCodec jsonCodec;
	
	protected abstract String getResourcePath();

	public ApiCaller(ApiToken apiToken) {
		this.apiToken = apiToken;
		this.httpClient = HttpClientFactory.getHttpClientInstance();
		this.jsonCodec = JsonCodecFactory.getJsonCodecInstance();
	}
	
	public ApiCaller(ApiToken apiToken, HttpClient httpClient) {
		this.apiToken = apiToken;
		this.httpClient = (httpClient == null)? HttpClientFactory.getHttpClientInstance() : httpClient;
		this.jsonCodec = JsonCodecFactory.getJsonCodecInstance();
	}
	

	public void setCustomHttpClient(HttpClient httpClient) {
		this.httpClient = httpClient;
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
	
	protected void insertItem(ApiResource item) throws ApiException {

		HttpRequest request = createHttpRequest(Method.POST);
		
		request.setBody(jsonCodec.toJSON(item));

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
		
		HttpResponse response = null;
		
		try {
			response = httpClient.send(request);
			if (response.hasErrorCode() && (response.getCode() != 401))
				throw new HttpException(String.valueOf(response.getCode()));
		} catch (HttpException he) {
			logger.error("HTTP Error: {}", he.getMessage());
			throw new ApiException("Error calling CommerceLayer API");
		}
		
		if (response.hasErrorCode() && (response.getCode() == 401)) {
			ApiError apiError = jsonCodec.fromJSON(response.getBody(), ApiError.class);
			throw new AuthException(apiError);
		}
		
		return response;

	}

	
	private HttpRequest createHttpRequest(Method httpMethod) {

		HttpRequest request = new HttpRequest(httpMethod);

		request.setUrl(ApiUtil.getResourceUrl(getResourcePath()));
		request.setContentType(ContentType.JSON);
		request.addHeader("Accept", ContentType.JSON);
		request.addHeader("Authorization", "Bearer " + apiToken.getAccessToken());

		return request;

	}	
	
}
