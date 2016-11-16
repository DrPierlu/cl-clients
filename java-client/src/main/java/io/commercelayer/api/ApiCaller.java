package io.commercelayer.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.exception.AuthException;
import io.commercelayer.api.exception.ConnectionException;
import io.commercelayer.api.exception.SystemException;
import io.commercelayer.api.http.HttpClient;
import io.commercelayer.api.http.HttpClientFactory;
import io.commercelayer.api.http.HttpRequest;
import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.http.HttpResponse;
import io.commercelayer.api.http.auth.HttpAuthOAuth2;
import io.commercelayer.api.json.JsonCodec;
import io.commercelayer.api.json.JsonCodecFactory;
import io.commercelayer.api.model.common.ApiObject;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.security.ApiToken;
import io.commercelayer.api.util.ApiUtils;
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
	
	


	protected <T extends ApiResource> List<T> getItemList(Class<T> class_) throws ApiException {

		HttpRequest request = createHttpRequest(Method.GET);

		HttpResponse response = call(request);
		
		List<T> list = jsonCodec.fromJSONList(response.getBody(), class_);
		
		return list;

	}

	protected void saveItemList(List<? extends ApiObject> itemList) throws ApiException {

		HttpRequest request = createHttpRequest(Method.PUT);
		
		request.setBody(jsonCodec.toJSONList(itemList));

		HttpResponse response = call(request);

	}


	protected <T extends ApiResource> T getItem(Long id, Class<T> class_) throws ApiException {

		logger.info("getItem execution [{}, {}]", id, class_.getName());
		
		HttpRequest request = createHttpRequest(Method.GET);
		request.setUrl(request.getUrl().concat("/").concat(String.valueOf(id)));
		
		HttpResponse response = call(request);

		T responseBody = jsonCodec.fromJSON(response.getBody(), class_);
		
		return responseBody;

	}
	
	
	protected ApiResource updateItem(ApiResource item) throws ApiException {

		logger.info("updateItem execution: {}", item);
		
		HttpRequest request = createHttpRequest(Method.PUT);
		request.setUrl(request.getUrl().concat("/").concat(String.valueOf(item.getId())));
		
		request.setBody(jsonCodec.toJSON(item, true));

		HttpResponse response = call(request);
		
		ApiResource resourceObject = jsonCodec.fromJSON(response.getBody(), item.getClass());
		
		return resourceObject;

	}
	
	protected ApiResource insertItem(ApiResource item) throws ApiException {
		
		logger.info("insertItem execution: {}", item);

		HttpRequest request = createHttpRequest(Method.POST);
		
		request.setBody(jsonCodec.toJSON(item, true));

		HttpResponse response = call(request);
		
		ApiResource resourceObject = jsonCodec.fromJSON(response.getBody(), item.getClass());
		
		return resourceObject;

	}

	protected void deleteItem(Long id) throws ApiException {

		logger.info("deleteItem execution: {}", id);

		HttpRequest request = createHttpRequest(Method.DELETE);
		request.setUrl(request.getUrl().concat("/").concat(String.valueOf(id)));
		
		HttpResponse response = call(request);
		
		System.out.println(response.getBody());

	}

	protected void deleteItem(ApiResource item) throws ApiException {
		deleteItem(item.getId());
	}

	
	private HttpResponse call(HttpRequest request) throws ConnectionException, ApiException, AuthException, SystemException {

		if ((apiToken == null) || apiToken.getAccessToken() == null)
			throw new AuthException("No access_token defined");
		
		HttpResponse response = null;
		
		logger.trace("Body: {}", request.getBody());
		
		response = httpClient.send(request);	// Connection Exception
		
		logger.debug("HTTP Response Code: {}", response.getCode());
		logger.trace("Body: {}", response.getBody());
		
		if (response.hasErrorCode()) {
			// Authentication Error
			if (response.getCode() == 401) {
				ApiError apiError = jsonCodec.fromJSON(response.getBody(), ApiError.class);
				throw new AuthException(apiError);
			}
			// Data Error
			else
			if (response.getCode() == 400) {
				ApiError apiError = jsonCodec.fromJSON(response.getBody(), ApiError.class);
				throw new ApiException(apiError);
			}
			// System Error
			else {
				throw new SystemException("Api System Exception");
			}
		}

		
		return response;

	}

	
	private HttpRequest createHttpRequest(Method httpMethod) {

		HttpRequest request = new HttpRequest(httpMethod);

		request.setUrl(ApiUtils.getResourceUrl(getResourcePath()));
		request.setContentType(ContentType.JSON);
		request.addHeader("Accept", ContentType.JSON);
		request.setHttpAuth(new HttpAuthOAuth2(apiToken.getAccessToken()));

		return request;

	}	
	
}
