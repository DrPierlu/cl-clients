package io.commercelayer.api.http;

import java.util.Map;

public abstract class HttpClient {
	
	public abstract HttpResponse send(HttpRequest httpRequest) throws HttpException;


	public String getQueryString(HttpRequest httpRequest, boolean withQuestionMark) {

		StringBuilder sb = new StringBuilder();

		if (httpRequest.hasQueryStringParams()) {
			for (Map.Entry<String, String> param : httpRequest.getQueryStringParams().entrySet()) {
				if (sb.length() == 0) {
					if (withQuestionMark)
						sb.append('?');
				} else {
					sb.append('&');
				}
				sb.append(param.getKey()).append('=').append(param.getValue());
			}
		}

		return sb.toString();

	}

}
