package io.commercelayer.api.http;

public abstract class HttpClient {

	public abstract HttpResponse send(HttpRequest httpRequest) throws HttpException;
	
//	public void setTimeout(int timeout) {
//		
//	}
//	
//	public void setProxy(Proxy proxy) {
//		
//	}
	
}
