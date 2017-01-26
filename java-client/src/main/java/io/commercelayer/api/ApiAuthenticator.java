package io.commercelayer.api;

import java.time.LocalDateTime;

import io.commercelayer.api.domain.ContentType;
import io.commercelayer.api.exception.AuthException;
import io.commercelayer.api.exception.CallException;
import io.commercelayer.api.http.HttpRequest;
import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.http.HttpResponse;
import io.commercelayer.api.http.auth.HttpAuthBasic;
import io.commercelayer.api.model.common.ApiError;
import io.commercelayer.api.operation.PostAuthToken;
import io.commercelayer.api.security.ApiAccount;
import io.commercelayer.api.security.ApiApplication;
import io.commercelayer.api.security.ApiChannel;
import io.commercelayer.api.security.ApiCustomer;
import io.commercelayer.api.security.ApiToken;
import io.commercelayer.api.security.AuthClientRequest;
import io.commercelayer.api.security.AuthPasswordRequest;
import io.commercelayer.api.security.AuthRefreshRequest;
import io.commercelayer.api.security.AuthRequest;
import io.commercelayer.api.util.ApiUtils;

public class ApiAuthenticator extends ApiConnector {

	public ApiToken authenticate(ApiChannel channel) throws AuthException {
		// Explicit Application Authentication call
		return authenticate((ApiApplication)channel);
	}


	public ApiToken authenticate(ApiApplication application) throws AuthException {

		logger.info("Authenticating Application... [{}]", application.getId());

		AuthRequest authRequest = new AuthClientRequest(application);

		ApiToken token = securityCall(authRequest);

		if (token != null) token.setReleaseDate(LocalDateTime.now());

		logger.info("Application Authentication Success [{}]", application);

		return token;

	}


	public ApiToken authenticate(ApiCustomer customer) throws AuthException {
		// Explicit Account Authentication call
		return authenticate((ApiAccount)customer);
	}


	public ApiToken authenticate(ApiAccount account) throws AuthException {

		logger.info("Authenticating Account... [{}]", account.getUsername());

		AuthRequest authRequest = new AuthPasswordRequest(account);

		ApiToken token = securityCall(authRequest);

		if (token != null) token.setReleaseDate(LocalDateTime.now());

		logger.info("Account Authentication Success [{}]", account);

		return token;

	}


	public ApiToken refreshToken(ApiAccount account, ApiToken token) throws AuthException {

		logger.info("Refreshing Token... [{}]", account.getUsername());

		AuthRequest authRequest = new AuthRefreshRequest(token.getRefreshToken());
		authRequest.setHttpAuth(new HttpAuthBasic(account.getAuthKey(), account.getAuthSecret()));

		ApiToken newToken = securityCall(authRequest);

		if (newToken != null) {
			token.setReleaseDate(LocalDateTime.now());
			token.setAccessToken(newToken.getAccessToken());
			token.setExpiresIn(newToken.getExpiresIn());
		}

		logger.info("RefreshToken Success [{}]", account);

		return token;

	}


	private ApiToken securityCall(AuthRequest authRequest) throws AuthException {

		if (authRequest.getHttpAuth() == null) {
			// throw new CallException("Missing authentication info");
			logger.error("Missing authentication info");
			return null;
		}

		HttpRequest httpRequest = new HttpRequest(Method.POST);

		httpRequest.setUrl(ApiUtils.getResourceUrl(PostAuthToken.OPERATION_PATH));
		httpRequest.setHttpAuth(authRequest.getHttpAuth());
		httpRequest.setBody(ApiUtils.getJsonCodecInstance().toJSON(authRequest, false));
		httpRequest.setContentType(ContentType.JSON);

		logger.debug("Auth Body: {}", httpRequest.getBody());

		HttpResponse httpResponse = httpClient.send(httpRequest);

		if (httpResponse.hasErrorCode()) {
			ApiError apiError = jsonCodec.fromJSON(httpResponse.getBody(), ApiError.class);
			apiError.setHttpErrorCode(httpResponse.getCode());
			throw new AuthException(apiError);
		}
		else
			if (!ContentType.JSON.equals(httpResponse.getContentType())) throw new CallException("Expected JSON Content Type [%s]", httpResponse.getContentType());

		ApiToken token = ApiUtils.getJsonCodecInstance().fromJSON(httpResponse.getBody(), ApiToken.class);

		return token;

	}

}
