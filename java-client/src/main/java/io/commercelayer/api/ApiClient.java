package io.commercelayer.api;

import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.exception.AuthException;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;
import io.commercelayer.api.operation.common.GetIdOperation;
import io.commercelayer.api.operation.common.MoveOperation;
import io.commercelayer.api.operation.common.PostOperation;
import io.commercelayer.api.operation.common.PutOperation;
import io.commercelayer.api.search.ApiSearchRequest;
import io.commercelayer.api.search.ApiSearchResponse;
import io.commercelayer.api.security.ApiAccount;
import io.commercelayer.api.security.ApiToken;

public class ApiClient {
	
	private ApiAccount account;
	private ApiToken token;
	
	private ApiCaller caller;
	private ApiAuthenticator authenticator;
	private ApiUploader uploader;
	
	public ApiClient(ApiAccount apiAccount) throws AuthException {
		
		super();
		account = apiAccount;
		
		authenticator = new ApiAuthenticator();
		
		token = authenticator.authenticate(account);
		
		caller = new ApiCaller(token);
		uploader = new ApiUploader();
		
	}
	
	
	private ApiToken refreshToken() throws AuthException {
		token = authenticator.refreshToken(account, token);
		caller.useToken(token);
		return token;
	}
	
	
	public <T extends ApiResource, O extends GetIdOperation<T>> ApiResponse<T> get(ApiRequest<O> apiRequest) throws ApiException, AuthException {
		try {
			return caller.get(apiRequest);
		}
		catch (AuthException ae) {
			refreshToken();
			return caller.get(apiRequest);
		}
	}
	
	
	public <T extends ApiResource, O extends PostOperation<T>> ApiResponse<T> post(ApiRequest<O> apiRequest) throws ApiException, AuthException {
		try {
			return caller.post(apiRequest);
		}
		catch (AuthException ae) {
			refreshToken();
			return caller.post(apiRequest);
		}
	}
	
	
	public <T extends ApiResource, O extends PutOperation<T>> ApiResponse<T> put(ApiRequest<O> apiRequest) throws ApiException, AuthException {
		try {
			return caller.put(apiRequest);
		}
		catch (AuthException ae) {
			refreshToken();
			return caller.put(apiRequest);
		}
	}
	
	
	public <T extends ApiResource, O extends DeleteOperation<T>> ApiResponse<T> delete(ApiRequest<O> apiRequest) throws ApiException, AuthException {
		try {
			return caller.delete(apiRequest);
		}
		catch (AuthException ae) {
			refreshToken();
			return caller.delete(apiRequest);
		}
	}
	
	
	public <T extends ApiResource, O extends MoveOperation<T>> ApiResponse<T> move(ApiRequest<O> apiRequest) throws ApiException, AuthException {
		try {
			return caller.move(apiRequest);
		}
		catch (AuthException ae) {
			refreshToken();
			return caller.move(apiRequest);
		}
	}
	
	
	public <T extends ApiResource> ApiSearchResponse<T> search(ApiSearchRequest<T> searchRequest) throws ApiException, AuthException {
		try {
			return caller.search(searchRequest);
		}
		catch (AuthException ae) {
			refreshToken();
			return caller.search(searchRequest);
		}
	}

}
