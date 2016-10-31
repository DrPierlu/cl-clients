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
		this.httpClient = setupClient();
	}
	
	
	private OkHttpClient setupClient() {
		OkHttpClient.Builder builder = new OkHttpClient.Builder();
		return builder.build();
	}
	
	
	private RequestBody getRequestBody(HttpRequest httpRequest) {
		return RequestBody.create(MediaType.parse(httpRequest.getContentType()), httpRequest.getBody());
	}
	
	
	public HttpResponse send(HttpRequest httpRequest) throws HttpException {
		
		// REQUEST
		Request.Builder requestBuilder = new Request.Builder().url(httpRequest.getUrl());
		
		// HTTP Method & Body
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
		
		// HTTP Headers
		if (httpRequest.hasHeaders()) {
			for (Map.Entry<String, String> header : httpRequest.getHeaders().entrySet()) {
				requestBuilder.addHeader(header.getKey(), header.getValue());
			}
		}
		
		if (httpRequest.getHttpAuth() != null) {
			requestBuilder.header("Authorization", httpRequest.getHttpAuth().getHttpRequestAuthHeader());
		}
				
		
		Request request = requestBuilder.build();
		
		
		// RESPONSE
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
	
	
//	private void setAuthentication(HttpBasicAuth basicAuth) {
//		
//		OkHttpClient.Builder builder = httpClient.newBuilder();
//		
//		builder.authenticator(new Authenticator() {
//			
//			private int authAttempts = 0;
//			
//	        @Override
//	        public Request authenticate(Route route, Response response) throws IOException {
//	        	authAttempts++;
//	            if (authAttempts > 3) {
//	                return null;
//	            }
//	            String credential = Credentials.basic(basicAuth.getUsername(), basicAuth.getPassword());
//	            return response.request().newBuilder().header("Authorization", credential).build();
//	        }
//	    });
//		builder.connectTimeout(10, TimeUnit.SECONDS);
//		builder.writeTimeout(10, TimeUnit.SECONDS);
//		builder.readTimeout(30, TimeUnit.SECONDS);
//		
//	}

}
