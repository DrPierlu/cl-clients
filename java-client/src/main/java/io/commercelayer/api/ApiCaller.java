package io.commercelayer.api;

import java.util.List;

import io.commercelayer.api.http.HttpClient;
import io.commercelayer.api.http.HttpClientFactory;
import io.commercelayer.api.http.HttpException;
import io.commercelayer.api.http.HttpRequest;
import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.http.HttpResponse;
import io.commercelayer.api.model.ApiResource;
import io.commercelayer.api.util.ContentType;

public abstract class ApiCaller<T extends ApiResource> {

	private final HttpClient httpClient;

	public ApiCaller() {
		this.httpClient = HttpClientFactory.getHttpClientInstance();
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

	protected abstract String getItemResourceName();

	private HttpResponse call(HttpRequest request) throws ApiException {

		try {

			HttpResponse response = httpClient.send(request);

			return null;

		} catch (HttpException he) {
			throw new ApiException();
		}

	}

	private HttpRequest createHttpRequest(Method httpMethod) {

		HttpRequest request = new HttpRequest(httpMethod);

		request.setContentType(ContentType.JSON);
		request.addHeader("Accept", ContentType.JSON);

		return request;

	}

}