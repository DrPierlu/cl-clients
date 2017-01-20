package io.commercelayer.api.test.common;

import java.util.Random;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.config.ApiConfig.Group;
import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.exception.AuthException;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.ApiOperation;
import io.commercelayer.api.operation.common.DeleteOperation;
import io.commercelayer.api.operation.common.GetIdOperation;
import io.commercelayer.api.operation.common.MoveOperation;
import io.commercelayer.api.operation.common.PostOperation;
import io.commercelayer.api.operation.common.PutOperation;
import io.commercelayer.api.search.ApiSearchRequest;
import io.commercelayer.api.search.ApiSearchResponse;
import io.commercelayer.api.security.ApiAccount;
import io.commercelayer.api.security.ApiAuthenticator;
import io.commercelayer.api.security.ApiToken;
import io.commercelayer.api.test.common.mock.ApiCallerMock;

public abstract class ApiTest<T extends ApiResource> {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	protected static final Random random = new Random(System.currentTimeMillis());
	
	
	
	@Test
	public abstract void runTest() throws ApiException;
	
		
	protected int randomValue() {
		return randomValue(1000000);
	}
	
	protected int randomValue(int bound) {
		return random.nextInt(bound);
	}
	
	protected boolean randomBoolean() {
		return random.nextBoolean();
	}
	
	protected String randomSuffix() {
		return StringUtils.leftPad(String.valueOf(randomValue()), 6, '0');
	}
	
	protected String randomField(String field) {
		if (field == null) return field;
		else return suffix(field, randomSuffix());
	}
	
	protected String suffix(String str, String suffix) {
		if (!StringUtils.isEmpty(str)) str = str.concat("_");
		return str.concat(suffix);
	}
	
	
	protected ApiSearchResponse<T> testSearch(ApiSearchRequest<T> request, ApiCaller caller, boolean enableAssertions) throws TestException {
		
		logger.info("Executing test ... [{}]", request.getOperation());
		
		if (caller == null) caller = getApiCaller();
		
		ApiSearchResponse<T> response = null;
		
		try {
			
			logger.info("********** Test Start");
			
			response = caller.search(request);
			
			if (response != null) logger.info("Response items count: {}", (response.getItemList() == null)? null : response.getItemList().size());
			
			
		}
		catch (ApiException ae) {
			throw new TestException(ae.getApiErrorDescription());
		}
		catch (AuthException ae) {
			throw new TestException(ae.getMessage());
		}
		finally {
			logger.info("********** Test End");
		}
		
		return response;
		
	}
	
	
	protected <O extends ApiOperation<T>> ApiResponse<T> test(ApiRequest<O> request, boolean enableAssertions) throws TestException {
		return test(request, null, enableAssertions);
	}
	

	protected <O extends ApiOperation<T>> ApiResponse<T> test(ApiRequest<O> request, ApiCaller caller) throws TestException {
		return test(request, caller, true);
	}
	
	
	@SuppressWarnings("unchecked")
	protected <O extends ApiOperation<T>> ApiResponse<T> test(ApiRequest<O> request, ApiCaller caller, boolean enableAssertions) throws TestException {
		
		logger.info("Executing test ... [{}]", request.getOperation());
		
		if (caller == null) caller = getApiCaller();
		
		ApiResponse<T> response = null;
		final ApiOperation<T> operation = request.getOperation();
		
		try {
			
			logger.info("********** Test Start");
			
			if (operation instanceof GetIdOperation) {
				response = testGet((ApiRequest<GetIdOperation<T>>)request, caller, enableAssertions);
			}
			else
			if (operation instanceof PutOperation) {
				response = testPut((ApiRequest<PutOperation<T>>)request, caller, enableAssertions);
			}
			else
			if (operation instanceof PostOperation) {
				response = testPost((ApiRequest<PostOperation<T>>)request, caller, enableAssertions);
			}
			else
			if (operation instanceof DeleteOperation) {
				response = testDelete((ApiRequest<DeleteOperation<T>>)request, caller, enableAssertions);
			}
			else
			if (operation instanceof MoveOperation) {
				response = testMove((ApiRequest<MoveOperation<T>>)request, caller, enableAssertions);
			}
			

			if (response != null) logger.info("Output: {}", response.getResource());
			
			
		}
		catch (ApiException ae) {
			throw new TestException(ae.getApiErrorDescription());
		}
		catch (AuthException ae) {
			throw new TestException(ae.getMessage());
		}
		finally {
			logger.info("********** Test End");
		}
		
		return response;
		
	}
	
	
	protected ApiResponse<T> testGet(ApiRequest<GetIdOperation<T>> request, ApiCaller caller) throws ApiException, AuthException {
		return testGet(request, caller, true);
	}
	
	protected ApiResponse<T> testGet(ApiRequest<GetIdOperation<T>> request, ApiCaller caller, boolean enableAssertions) throws ApiException, AuthException {
		
		logger.info("Executing testGet ... [{}]", request.getOperation());
		
		ApiResponse<T> response = caller.get(request);
		
		// Assertions
		if (enableAssertions)
		try {
		
			logger.info("Evaluating assertions ...");
		
			Assert.assertNotNull(response.getResource());
			Assert.assertNotNull(response.getResource().getId());
			Assert.assertEquals(request.getOperation().getId(), response.getResource().getId());
			
			logger.info("Assertions OK");
			
		}
		catch (AssertionError ae) {
			logger.info("Assertions KO");
			throw ae;
		}
		
		
		return response;
		
	}
	
	
	protected ApiResponse<T> testPost(ApiRequest<? extends PostOperation<T>> request, ApiCaller caller) throws ApiException, AuthException {
		return testPost(request, caller, true);
	}
	
	protected ApiResponse<T> testPost(ApiRequest<? extends PostOperation<T>> request, ApiCaller caller, boolean enableAssertions) throws ApiException, AuthException {
		
		ApiResponse<T> response = caller.post(request);
		
		// Assertions
		if (enableAssertions)
		try {
		
			logger.info("Evaluating assertions ...");
		
			Assert.assertNotNull(response.getResource());
			Assert.assertNotNull(response.getResource().getId());
			
			logger.info("Assertions OK");
			
		}
		catch (AssertionError ae) {
			logger.info("Assertions KO");
			throw ae;
		}
		
		
		return response;
		
	}
	
	protected ApiResponse<T> testPut(ApiRequest<PutOperation<T>> request, ApiCaller caller) throws ApiException, AuthException {
		return testPut(request, caller, true);
	}
	
	protected ApiResponse<T> testPut(ApiRequest<PutOperation<T>> request, ApiCaller caller, boolean enableAssertions) throws ApiException, AuthException {
		
		ApiResponse<T> response = caller.put(request);
		
		// Assertions
		// Assertions
		if (enableAssertions)
		try {
		
			logger.info("Evaluating assertions ...");
		
			Assert.assertNotNull(response.getResource());
			Assert.assertNotNull(response.getResource().getId());
			Assert.assertEquals(request.getOperation().getPayload().getId(), response.getResource().getId());
			
			logger.info("Assertions OK");
			
		}
		catch (AssertionError ae) {
			logger.info("Assertions KO");
			throw ae;
		}
		
		
		return response;
		
	}
	
	
	protected ApiResponse<T> testDelete(ApiRequest<DeleteOperation<T>> request, ApiCaller caller) throws ApiException, AuthException {
		return testDelete(request, caller, true);
	}
	
	protected ApiResponse<T> testDelete(ApiRequest<? extends DeleteOperation<T>> request, ApiCaller caller, boolean enableAssertions) throws ApiException, AuthException {
		
		ApiResponse<T> response = caller.delete(request);
		
		// Assertions
		
		return response;
		
	}
	
	
	protected ApiResponse<T> testMove(ApiRequest<MoveOperation<T>> request, ApiCaller caller) throws TestException {
		return testMove(request, caller, true);
	}
	
	protected ApiResponse<T> testMove(ApiRequest<MoveOperation<T>> request, ApiCaller caller, boolean enablAssertions) throws TestException {
		
		ApiResponse<T> response = null;
		
		try {
			response = caller.move(request);
		}
		catch (ApiException ae) {
			throw new TestException(ae.getApiErrorDescription());
		}
		catch (AuthException ae) {
			throw new TestException(ae.getMessage());
		}
		
		// Assertions
		
		return response;
		
	}
	
	
	
	private ApiCaller initCaller(ApiToken apiToken) {
		return ApiConfig.isPropertyEnabled(ApiConfig.Group.test, "mock")? new ApiCallerMock(apiToken) : new ApiCaller(apiToken);
	}
	
	
	private ApiToken authenticate(ApiAccount apiAccount) throws AuthException {		
		ApiAuthenticator auth = new ApiAuthenticator();
		return auth.authenticate(apiAccount);
	}
	
	protected ApiCaller getApiCaller() {
		return getApiCaller(null);
	}
	
	protected ApiCaller getApiCaller(ApiAccount apiAccount) {
		
		ApiAccount account = (apiAccount == null)? getDefaultAccount() : apiAccount;
		
		ApiCaller caller = null;
		
		try {
			ApiToken token = authenticate(account);
			caller = initCaller(token);
		}
		catch (AuthException ae) {
			logger.error(ae.getMessage());
		}
		
		return caller;
		
	}
	
	protected static ApiAccount getDefaultAccount() {

		ApiAccount account = new ApiAccount();
		
		account.setUsername(ApiConfig.getProperty(Group.authentication, "username"));
		account.setEnvironmentId(ApiConfig.getProperty(Group.authentication, "environmentId"));
		account.setAuthKey(ApiConfig.getProperty(Group.authentication, "authKey"));
		account.setAuthSecret(ApiConfig.getProperty(Group.authentication, "authSecret"));
		
		return account;
		
	}
	
}
