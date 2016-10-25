package io.commercelayer.api;

import java.util.List;

import io.commercelayer.api.http.HttpClient;
import io.commercelayer.api.http.HttpClientFactory;
import io.commercelayer.api.http.HttpException;
import io.commercelayer.api.http.HttpRequest;
import io.commercelayer.api.http.HttpResponse;
import io.commercelayer.api.model.ApiObject;
import io.commercelayer.api.security.ApiAuth;

public abstract class ApiCaller<T extends ApiObject> {
	
	private final HttpClient httpClient;
	private final ApiAuth authentication;
			
	public ApiCaller(ApiAuth authentication) {
		this.httpClient = HttpClientFactory.getHttpClientInstance();
		this.authentication = authentication;
	}

	public List<T> getItemList() throws ApiException {
		
		HttpRequest request = new HttpRequest();
		
		HttpResponse response = call(request);
			
		return null;
		
	}
	
	public void saveItemList(List<T> itemList) throws ApiException {
		
		HttpRequest request = new HttpRequest();
		
		HttpResponse response = call(request);
		
	}
	
	public T getItem(String id) throws ApiException {
		
		HttpRequest request = new HttpRequest();
		
		HttpResponse response = call(request);
		
		return null;
		
	}
	
	public void updateItem(T item) throws ApiException {
		
		HttpRequest request = new HttpRequest();
		
		HttpResponse response = call(request);
		
	}
	
	public void deleteItem(String id) throws ApiException {
		
		HttpRequest request = new HttpRequest();
		
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
			
		}
		catch (HttpException he) {
			throw new ApiException();
		}
		
	}
	
}
