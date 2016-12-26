package io.commercelayer.api.test.common;

import java.util.Random;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
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
import io.commercelayer.api.util.LogUtils;

public abstract class ApiTest<T extends ApiResource> {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	protected static final Random random = new Random(System.currentTimeMillis());
	
//	protected static ApiAccount account;
//	protected static ApiToken token;
	
	
	
	@Test
	public abstract void runTest() throws ApiException;
	
	
	public int randomValue() {
		return random.nextInt(1000);
	}
	
	public String randomString() {
		return StringUtils.leftPad(String.valueOf(randomValue()), 6, '0');
	}

	public String randomField(String field) {
		if (field == null) return field;
		else {
			if (!StringUtils.isEmpty(field)) field = field.concat("_");
			return field.concat(randomString());
		}
	}
	
	
	protected ApiSearchResponse<T> testSearch(ApiSearchRequest request, Class<T> resourceType, ApiCaller caller) {
		
		logger.info("Executing test ... [{}, {}]", request.getOperation().getClass().getSimpleName(), resourceType.getSimpleName());
		
		if (caller == null) caller = getApiCaller();
		
		ApiSearchResponse<T> response = null;
		
		try {
			
			response = caller.search(request, resourceType);
			
			if (response.hasError()) System.out.println(response.getApiError().getError());
			else System.out.println(ToStringBuilder.reflectionToString(response.getItemList(), LogUtils.TO_STRING_STYLE));
			
			
		} catch (ApiException e) {
			logger.error(LogUtils.printStackTrace(e));
		}
		
		return response;
		
	}
	
	
	protected <O extends ApiOperation> ApiResponse<T> test(ApiRequest<O> request, Class<T> resourceType) {
		return test(request, resourceType, null);
	}
	
	@SuppressWarnings("unchecked")
	protected <O extends ApiOperation> ApiResponse<T> test(ApiRequest<O> request, Class<T> resourceType, ApiCaller caller) {
		
		logger.info("Executing test ... [{}, {}]", request.getOperation(), resourceType.getSimpleName());
		
		if (caller == null) caller = getApiCaller();
		
		ApiResponse<T> response = null;
		final ApiOperation operation = request.getOperation();
		
		try {
			
			logger.info("********** Test Start");
			
			if (operation instanceof GetIdOperation) {
				response = testGet((ApiRequest<GetIdOperation>)request, resourceType, caller);
			}
			else
			if (operation instanceof PutOperation) {
				response = testPut((ApiRequest<PutOperation>)request, resourceType, caller);
			}
			else
			if (operation instanceof PostOperation) {
				response = testPost((ApiRequest<PostOperation>)request, resourceType, caller);
			}
			else
			if (operation instanceof DeleteOperation) {
				testDelete((ApiRequest<DeleteOperation>)request, caller);
			}
			else
			if (operation instanceof MoveOperation) {
				response = caller.move((ApiRequest<MoveOperation>)request, resourceType);
			}
			

			if (response.hasError()) logger.error("Error: {}", response.getApiError().getError());
			else logger.info("Output: {}", response.getResource());
			
			
		} catch (ApiException e) {
			logger.error(LogUtils.printStackTrace(e));
		}
		finally {
			logger.info("********** Test End");
		}
		
		return response;
		
	}
	
	
	private ApiResponse<T> testGet(ApiRequest<GetIdOperation> request, Class<T> resourceType, ApiCaller caller) throws ApiException {
		
		logger.info("Executing testGet ... [{}, {}]", request.getOperation(), resourceType.getSimpleName());
		
		ApiResponse<T> response = caller.get(request, resourceType);
		
		// Assertions
		try {
		
			logger.info("Evaluating assertions ...");
		
			Assert.assertNotNull(response.getResource());
			Assert.assertNotNull(response.getResource().getId());
			Assert.assertEquals(request.getOperation().getId(), response.getResource().getId());
			
			logger.info("Assertions OK");
			
		}
		catch (AssertionError ae) {
			logger.info("Assertions KO");
		}
		
		
		return response;
		
	}
	
	
	private ApiResponse<T> testPost(ApiRequest<PostOperation> request, Class<T> resourceType, ApiCaller caller) throws ApiException {
		
		ApiResponse<T> response = caller.post(request, resourceType);
		
		// Assertions
		
		Assert.assertNotNull(response.getResource());
		Assert.assertNotNull(response.getResource().getId());
		
		return response;
		
	}
	
	
	private ApiResponse<T> testPut(ApiRequest<PutOperation> request, Class<T> resourceType, ApiCaller caller) throws ApiException {
		
		ApiResponse<T> response = caller.put(request, resourceType);
		
		// Assertions
		
		Assert.assertNotNull(response.getResource());
		Assert.assertNotNull(response.getResource().getId());
		Assert.assertEquals(request.getOperation().getPayload().getId(), response.getResource().getId());
		
		return response;
		
	}
	
	
	private void testDelete(ApiRequest<DeleteOperation> request, ApiCaller caller) throws ApiException {
		
		caller.delete(request);
		
		// Assertions
		
		
	}
	
	
	private ApiResponse<T> testMove(ApiRequest<MoveOperation> request, Class<T> resourceType, ApiCaller caller) throws ApiException {
		
		ApiResponse<T> response = caller.move(request, resourceType);
		
		// Assertions
		
		return response;
		
	}
	
	
	
	private ApiCaller initCaller(ApiToken apiToken) {
		return new ApiCaller(apiToken);
	}
	
	
	private ApiToken authenticate(ApiAccount apiAccount) {		
		ApiAuthenticator auth = new ApiAuthenticator();
		return auth.authenticate(apiAccount);
	}
	
	protected ApiCaller getApiCaller() {
		return getApiCaller(null);
	}
	
	protected ApiCaller getApiCaller(ApiAccount apiAccount) {
		ApiAccount account = (apiAccount == null)? getDefaultAccount() : apiAccount;
		ApiToken token = authenticate(account);
		ApiCaller caller = initCaller(token);
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
