package io.commercelayer.api.http;

import java.util.HashMap;

public class HttpRequest {

	public static enum Method {
		GET, PUT, POST, DELETE
	}

	private Method method;
	private String url;
	private HashMap<String, String> header = new HashMap<>();
	private String body;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public HashMap<String, String> getHeaders() {
		return header;
	}

	public void setHeaders(HashMap<String, String> header) {
		this.header = header;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void addHeader(String header, String value) {
		this.header.put(header, value);
	}

	public String getHeader(String header) {
		return this.header.get(header);
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

}
