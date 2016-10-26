package io.commercelayer.api.http;

import java.util.Map;

public abstract class HttpClient {

	public abstract HttpResponse send(HttpRequest httpRequest) throws HttpException;
	
//	public void setTimeout(int timeout) {
//		
//	}
//	
//	public void setProxy(Proxy proxy) {
//		
//	}
	
	
	public String getQueryString(HttpRequest httpRequest, boolean withQuestionMark) {
	
		StringBuilder sb = new StringBuilder();
		
		if (httpRequest.hasQueryStringParams()) {
			for (Map.Entry<String, String> param : httpRequest.getQueryStringParams().entrySet()) {
				
			}
		}
		
	}
	
}
