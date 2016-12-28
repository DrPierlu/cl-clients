package io.commercelayer.api.test.common;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.model.common.ApiResource;

public abstract class IntegrationTest<T extends ApiResource> extends ApiTest<T> {

	public void runTest() throws ApiException {
		integrationTest();
	}
	

	private void integrationTest() throws ApiException {
		
		ApiCaller caller = getApiCaller();
		
		ApiResponse<T> insRes = testInsert(caller);
		
		ApiResponse<T> updRes = testUpdate(insRes.getResource(), caller);
		
		/* ApiResponse<T> delRes = */testDelete(updRes.getResource(), caller);
		
	}
	
	protected abstract ApiResponse<T> testInsert(ApiCaller caller);
	
	protected abstract ApiResponse<T> testUpdate(T oldRes, ApiCaller caller);
	
	protected abstract ApiResponse<T> testDelete(T res, ApiCaller caller);
	
}
