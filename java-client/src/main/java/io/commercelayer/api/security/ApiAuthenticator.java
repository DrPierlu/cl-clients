package io.commercelayer.api.security;

import io.commercelayer.api.http.HttpClient;
import io.commercelayer.api.http.HttpClientFactory;
import io.commercelayer.api.http.HttpException;
import io.commercelayer.api.http.HttpRequest;
import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.http.HttpResponse;
import io.commercelayer.api.http.auth.HttpAuthBasic;
import io.commercelayer.api.util.ApiUtil;

public final class ApiAuthenticator {

	private static final HttpClient httpClient = HttpClientFactory.getHttpClientInstance();

	public static ApiToken authenticate(ApiAccount account) throws AuthException {

		AuthRequest authRequest = new AuthRequest(account);

		HttpRequest httpRequest = new HttpRequest(Method.POST);
		httpRequest.setUrl(ApiUtil.getResourceUrl("/auth/token"));
		httpRequest.setHttpAuth(new HttpAuthBasic(account.getAuthKey(), account.getAuthSecret()));
		httpRequest.setBody(ApiUtil.getJsonCodecInstance().toJSON(authRequest));

		HttpResponse httpResponse = null;

		try {
			httpResponse = httpClient.send(httpRequest);
		} catch (HttpException he) {
			throw new AuthException(String.format("Authentication HTTP error [%s]", account.toString()));
		}

		ApiToken token = ApiUtil.getJsonCodecInstance().fromJSON(httpResponse.getBody(), ApiToken.class);

		return token;

	}

}
