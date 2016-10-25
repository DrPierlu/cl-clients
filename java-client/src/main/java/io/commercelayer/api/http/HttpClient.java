package io.commercelayer.api.http;

public abstract class HttpClient {

	public HttpResponse send(HttpRequest request) throws HttpException {
		return new HttpResponse();
	}
	
}
