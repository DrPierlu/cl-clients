package io.commercelayer.api.http;

import java.util.HashMap;

public class HttpResponse {

	private int code;
	private HashMap<String, String> headers = new HashMap<String, String>();
	private String body;
	private String contentType;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public HashMap<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(HashMap<String, String> header) {
		this.headers = header;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void addHeader(String header, String value) {
		this.headers.put(header, value);
	}

	public String getHeader(String header) {
		return this.headers.get(header);
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
