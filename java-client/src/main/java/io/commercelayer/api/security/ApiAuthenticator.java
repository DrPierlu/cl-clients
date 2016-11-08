package io.commercelayer.api.security;

import io.commercelayer.api.http.HttpClient;
import io.commercelayer.api.http.HttpClientFactory;
import io.commercelayer.api.http.HttpException;
import io.commercelayer.api.http.HttpRequest;
import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.http.HttpResponse;
import io.commercelayer.api.http.auth.HttpAuthBasic;
import io.commercelayer.api.util.ApiUtil;
import io.commercelayer.api.util.ContentType;

public final class ApiAuthenticator {

	private static final HttpClient httpClient = HttpClientFactory.getHttpClientInstance();

	public static ApiToken authenticate(ApiAccount account) throws AuthException {

		AuthRequest authRequest = new AuthRequest(account);

		HttpRequest httpRequest = new HttpRequest(Method.POST);
		httpRequest.setUrl(ApiUtil.getResourceUrl("/auth/token"));
		httpRequest.setHttpAuth(new HttpAuthBasic(account.getAuthKey(), account.getAuthSecret()));
		httpRequest.setBody(ApiUtil.getJsonCodecInstance().toJSON(authRequest));
		httpRequest.setContentType(ContentType.JSON);

		HttpResponse httpResponse = null;

		try {
			httpResponse = httpClient.send(httpRequest);
		} catch (HttpException he) {
			throw new AuthException(String.format("Authentication HTTP error [%s]", account.toString()));
		}

		ApiToken token = ApiUtil.getJsonCodecInstance().fromJSON(httpResponse.getBody(), ApiToken.class);

		return token;

	}
	
	
	public static void main(String[] args) {
		
		ApiAccount aa = new ApiAccount();
		aa.setUsername("pierluigiviti@gmail.com");
		aa.setAuthKey("8967838eed2ad96d2f7451dad6358112");
		aa.setAuthSecret("9624e353b807bf2dffdb2855542fd28b6e1918e006800737b8a0d5dd6894a8a7");
		
		ApiToken at = authenticate(aa);
		
		System.out.println(at);
		
	}

}
