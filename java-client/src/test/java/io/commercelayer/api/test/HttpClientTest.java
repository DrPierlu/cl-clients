package io.commercelayer.api.test;

import io.commercelayer.api.http.HttpClient;
import io.commercelayer.api.http.HttpClientFactory;
import io.commercelayer.api.http.HttpException;
import io.commercelayer.api.http.HttpRequest;
import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.http.HttpResponse;

public class HttpClientTest {

	public static void main(String args[]) {
		
		HttpClient client = HttpClientFactory.getHttpClientInstance();
		
		HttpRequest request = new HttpRequest(Method.GET);
		
		request.setUrl("http://www.infogroup.it");
		
		
		HttpResponse response = null;
		
		try {
			response = client.send(request);
		}
		catch (HttpException he) {
			he.printStackTrace();
		}
		
		System.out.println(response.getBody());
		
	}
	
}
