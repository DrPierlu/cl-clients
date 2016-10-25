package io.commercelayer.api.http;

import java.io.IOException;
import java.util.Map;

import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HttpClientOkHttpImpl extends HttpClient {

	private final OkHttpClient httpClient;

	
	public HttpClientOkHttpImpl() {
		this.httpClient = new OkHttpClient();
	}
	
	
	private RequestBody getRequestBody(HttpRequest httpRequest) {
		return RequestBody.create(MediaType.parse(httpRequest.getContentType()), httpRequest.getBody());
	}
	
	
	public HttpResponse send(HttpRequest httpRequest) throws HttpException {
		
		Request.Builder requestBuilder = new Request.Builder().url(httpRequest.getUrl());
		
		switch (httpRequest.getMethod()) {
			default:
			case GET: {
				requestBuilder.get();
				break;
			}
			case POST: {
				requestBuilder.post(getRequestBody(httpRequest));
				break;
			}
			case PUT: {
				requestBuilder.put(getRequestBody(httpRequest));
				break;
			}
			case DELETE: {
				requestBuilder.delete();
				break;
			}
		}
		
		
		if (httpRequest.hasHeaders()) {
			for (Map.Entry<String, String> header : httpRequest.getHeaders().entrySet()) {
				requestBuilder.addHeader(header.getKey(), header.getValue());
			}
		}
				
		
		Request request = requestBuilder.build();

		Response response = null;
		
		try {
			response = httpClient.newCall(request).execute();
		}
		catch (IOException ioe) {
			throw new HttpException(String.format("HTTP Error calling [%s:%s]", httpRequest.getMethod(), httpRequest.getUrl()));
		}
		
		HttpResponse httpResponse = new HttpResponse();
		
		// HTTP Code
		httpResponse.setCode(response.code());
		
		// HTTP Headers
		Headers responseHeaders = response.headers();
		for (String hName : responseHeaders.names()) {
			httpResponse.addHeader(hName, responseHeaders.get(hName));			
		}
		
		try {
			httpResponse.setBody(response.body().string());
		}
		catch (IOException ioe) {
			throw new HttpException(String.format("HTTP Error reading body response [%s:%s]", httpRequest.getMethod(), httpRequest.getUrl()));
		}

		return httpResponse;
		
	}
	
	
	
//	client.setAuthenticator(new OkAuthenticator() {
//		  @Override public Credential authenticate(
//		      Proxy proxy, URL url, List<Challenge> challenges) throws IOException {
//		    return Credential.basic("scott", "tiger");
//		  }
//
//		  @Override public Credential authenticateProxy(
//		      Proxy proxy, URL url, List<Challenge> challenges) throws IOException {
//		    return null;
//		  }
//		});

}
