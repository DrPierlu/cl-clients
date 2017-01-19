package io.commercelayer.api;

import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.exception.AuthException;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;
import io.commercelayer.api.security.ApiAccount;
import io.commercelayer.api.security.ApiAuthenticator;
import io.commercelayer.api.security.ApiToken;

public class ApiClient {
	
	private ApiAccount account;
	private ApiToken token;
	
	private ApiCaller caller;
	private ApiAuthenticator authenticator;
	
	public ApiClient(ApiAccount apiAccount) throws AuthException {
		
		super();
		account = apiAccount;
		
		authenticator = new ApiAuthenticator();
		
		token = authenticator.authenticate(account);
		
		caller = new ApiCaller(token);
		
	}
	
//	
//	private ApiToken refreshToken() throws AuthException {
//		token = authenticator.refreshToken(account, token);
//		caller.useToken(token);
//		return token;
//	}
//	
//	
//	public <T extends ApiResource> ApiResponse<T> get(ApiRequest<? extends GetIdOperation> apiRequest, Class<T> resourceType) throws ApiException {
//		try {
//			return caller.get(apiRequest, resourceType);
//		}
//		catch (AuthException ae) {
//			try {
//				refreshToken();
//				return caller.get(apiRequest, resourceType);
//			}
//			catch (AuthException aer) {
//				throw new ApiException("Authentication Expired!");
//			}
//		}
//	}

}
