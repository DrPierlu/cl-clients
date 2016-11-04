package io.commercelayer.api.security;

import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.http.HttpRequest;
import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.util.ApiUtil;

public final class ApiAuthenticator {
	
	public static ApiToken authenticate(ApiAccount account) throws AuthException {
		
		AuthRequest authRequest = new AuthRequest(account);
		
		HttpRequest httpRequest = new HttpRequest(Method.POST);
		httpRequest.setUrl(ApiUtil.getResourceUrl("/auth/token"));
		httpRequest.setHttpAuth(new HttpAuthBasic(account.getAuthKey(), account.getAuthSecret()));
		httpRequest.setBody(ApiUtil.getJsonCodecInstance().toJSON(authRequest));
		
		ApiToken token = null;
		
		return token;
		
	}
	
}
