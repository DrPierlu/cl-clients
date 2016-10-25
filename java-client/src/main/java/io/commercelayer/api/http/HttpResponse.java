package io.commercelayer.api.http;

import java.util.HashMap;

public class HttpResponse {

	private String code;
	private HashMap<String, String> header = new HashMap<>();
	private String body;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

}
