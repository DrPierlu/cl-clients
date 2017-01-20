package io.commercelayer.api.security;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.domain.ContentType;
import io.commercelayer.api.exception.AuthException;
import io.commercelayer.api.exception.CallException;
import io.commercelayer.api.http.HttpClient;
import io.commercelayer.api.http.HttpClientFactory;
import io.commercelayer.api.http.HttpRequest;
import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.http.HttpResponse;
import io.commercelayer.api.http.auth.HttpAuthBasic;
import io.commercelayer.api.json.JsonCodec;
import io.commercelayer.api.json.JsonCodecFactory;
import io.commercelayer.api.model.common.ApiError;
import io.commercelayer.api.operation.PostAuthToken;
import io.commercelayer.api.util.ApiUtils;

public class ApiAuthenticator {
	
	private static final Logger logger = LoggerFactory.getLogger(ApiAuthenticator.class);

	private final HttpClient httpClient = HttpClientFactory.getHttpClientInstance();
	private final JsonCodec jsonCodec = JsonCodecFactory.getJsonCodecInstance();
	

	public ApiToken authenticate(ApiAccount account) throws AuthException {
		
		logger.info("Authenticating User... [{}]", account.getUsername());

		AuthPasswordRequest authRequest = new AuthPasswordRequest(account);

		HttpRequest httpRequest = new HttpRequest(Method.POST);
		httpRequest.setUrl(ApiUtils.getResourceUrl(PostAuthToken.OPERATION_PATH));
		httpRequest.setHttpAuth(new HttpAuthBasic(account.getAuthKey(), account.getAuthSecret()));
		httpRequest.setBody(ApiUtils.getJsonCodecInstance().toJSON(authRequest, false));
		httpRequest.setContentType(ContentType.JSON);
		
		logger.debug("Auth Body: {}", httpRequest.getBody());

		HttpResponse httpResponse = httpClient.send(httpRequest);
		
		if (httpResponse.hasErrorCode()) {
//			if (httpResponse.getCode() == 401) { // Authentication Error
				ApiError apiError = jsonCodec.fromJSON(httpResponse.getBody(), ApiError.class);
				apiError.setHttpErrorCode(httpResponse.getCode());
				throw new AuthException(apiError);
//			}
//			else throw new CallException("HTTP Error Code [%d]", httpResponse.getCode());
		}
		else
		if (!ContentType.JSON.equals(httpResponse.getContentType())) throw new CallException("Expected JSON Content Type [%s]", httpResponse.getContentType());
		
		
		logger.info("Authentication Success [{}]", account);

		ApiToken token = ApiUtils.getJsonCodecInstance().fromJSON(httpResponse.getBody(), ApiToken.class);
		
		if (token != null) token.setReleaseDate(LocalDateTime.now());

		return token;

	}
	
	public ApiToken refreshToken(ApiAccount account, ApiToken token) throws AuthException {
		
		logger.info("Refreshing Token... [{}]", account.getUsername());

		AuthRefreshRequest authRequest = new AuthRefreshRequest(token.getRefreshToken());

		HttpRequest httpRequest = new HttpRequest(Method.POST);
		httpRequest.setUrl(ApiUtils.getResourceUrl(PostAuthToken.OPERATION_PATH));
		httpRequest.setHttpAuth(new HttpAuthBasic(account.getAuthKey(), account.getAuthSecret()));
		httpRequest.setBody(ApiUtils.getJsonCodecInstance().toJSON(authRequest, false));
		httpRequest.setContentType(ContentType.JSON);
		
		logger.debug("Auth Body: {}", httpRequest.getBody());

		HttpResponse httpResponse = httpClient.send(httpRequest);
		
		if (httpResponse.hasErrorCode()) {
//			if (httpResponse.getCode() == 401) { // Authentication Error
				ApiError apiError = jsonCodec.fromJSON(httpResponse.getBody(), ApiError.class);
				apiError.setHttpErrorCode(httpResponse.getCode());
				throw new AuthException(apiError);
//			}
//			else throw new CallException("HTTP Error Code [%d]", httpResponse.getCode());
		}
		else
		if (!ContentType.JSON.equals(httpResponse.getContentType())) throw new CallException("Expected JSON Content Type [%s]", httpResponse.getContentType());


		ApiToken newToken = ApiUtils.getJsonCodecInstance().fromJSON(httpResponse.getBody(), ApiToken.class);
		
		token.setReleaseDate(LocalDateTime.now());
		token.setAccessToken(newToken.getAccessToken());
		token.setExpiresIn(newToken.getExpiresIn());

		return token;

	}

}
