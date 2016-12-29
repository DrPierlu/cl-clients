package io.commercelayer.api.security;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.domain.ContentType;
import io.commercelayer.api.exception.AuthException;
import io.commercelayer.api.exception.ConnectionException;
import io.commercelayer.api.http.HttpClient;
import io.commercelayer.api.http.HttpClientFactory;
import io.commercelayer.api.http.HttpRequest;
import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.http.HttpResponse;
import io.commercelayer.api.http.auth.HttpAuthBasic;
import io.commercelayer.api.util.ApiUtils;

public final class ApiAuthenticator {
	
	private static final Logger logger = LoggerFactory.getLogger(ApiAuthenticator.class);

	private final HttpClient httpClient = HttpClientFactory.getHttpClientInstance();

	public ApiToken authenticate(ApiAccount account) throws AuthException {
		
		logger.info("Authenticating User... [{}]", account.getUsername());

		AuthRequest authRequest = new AuthRequest(account);

		HttpRequest httpRequest = new HttpRequest(Method.POST);
		httpRequest.setUrl(ApiUtils.getResourceUrl("/auth/token"));
		httpRequest.setHttpAuth(new HttpAuthBasic(account.getAuthKey(), account.getAuthSecret()));
		httpRequest.setBody(ApiUtils.getJsonCodecInstance().toJSON(authRequest, false));
		httpRequest.setContentType(ContentType.JSON);
		
		logger.debug("Auth Body: {}", httpRequest.getBody());

		HttpResponse httpResponse = null;

		try {
		
			try {
				httpResponse = httpClient.send(httpRequest);
			} catch (ConnectionException he) {
				logger.error("Request HTTP Error: {}", he.getMessage());
				throw new AuthException(String.format("Authentication HTTP error [%s]", account));
			}
			
			if (httpResponse.getCode() >= 300) throw new AuthException("HTTP Error Code [%d]", httpResponse.getCode());
			if (!ContentType.JSON.equals(httpResponse.getContentType())) throw new AuthException("Expected JSON Content Type [%s]", httpResponse.getContentType());
		
		}
		catch (AuthException ae) {
			logger.info("Authentication Failure [{}]", account);
			throw ae;
		}
		
		logger.info("Authentication Success [{}]", account);

		ApiToken token = ApiUtils.getJsonCodecInstance().fromJSON(httpResponse.getBody(), ApiToken.class);
		
		if (token != null) token.setReleaseDate(LocalDateTime.now());

		return token;

	}
	
	public ApiToken refreshToken(ApiAccount account, ApiToken token) throws AuthException {
		
		logger.info("Refreshing Token... [{}]", account.getUsername());

		AuthRefreshRequest authRequest = new AuthRefreshRequest(token.getRefreshToken());

		HttpRequest httpRequest = new HttpRequest(Method.POST);
		httpRequest.setUrl(ApiUtils.getResourceUrl("/auth/token"));
		httpRequest.setHttpAuth(new HttpAuthBasic(account.getAuthKey(), account.getAuthSecret()));
		httpRequest.setBody(ApiUtils.getJsonCodecInstance().toJSON(authRequest, false));
		httpRequest.setContentType(ContentType.JSON);
		
		logger.debug("Auth Body: {}", httpRequest.getBody());

		HttpResponse httpResponse = null;

		try {
			httpResponse = httpClient.send(httpRequest);
		} catch (ConnectionException he) {
			logger.error("Request HTTP Error: {}", he.getMessage());
			throw new AuthException("Token refresh error");
		}
		
		if (httpResponse.getCode() >= 300) throw new AuthException("HTTP Error Code [%d]", httpResponse.getCode());
		if (!ContentType.JSON.equals(httpResponse.getContentType())) throw new AuthException("Expected JSON Content Type [%s]", httpResponse.getContentType());


		ApiToken newToken = ApiUtils.getJsonCodecInstance().fromJSON(httpResponse.getBody(), ApiToken.class);
		
		token.setReleaseDate(LocalDateTime.now());
		token.setAccessToken(newToken.getAccessToken());
		token.setExpiresIn(newToken.getExpiresIn());

		return token;

	}

}
