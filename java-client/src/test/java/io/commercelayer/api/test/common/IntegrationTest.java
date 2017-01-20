package io.commercelayer.api.test.common;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.common.ApiResource;

public abstract class IntegrationTest<T extends ApiResource> extends ApiTest<T> {
	
	public void runTest() {
		integrationTest();
	}
	

	private void integrationTest() {
		
		ApiCaller caller = getApiCaller();
		
		ApiResponse<T> insRes = crudCreateTest(caller);
		
		ApiResponse<T> getRes = crudReadTest(insRes.getResource(), caller);
		
		ApiResponse<T> updRes = crudUpdateTest(getRes.getResource(), caller);
		
		@SuppressWarnings("unused")
		ApiResponse<T> delRes = crudDeleteTest(updRes.getResource(), caller);
		
	}
	
	protected abstract ApiResponse<T> crudCreateTest(ApiCaller caller);
	
	protected abstract ApiResponse<T> crudReadTest(T res, ApiCaller caller);
	
	protected abstract ApiResponse<T> crudUpdateTest(T oldRes, ApiCaller caller);
	
	protected abstract ApiResponse<T> crudDeleteTest(T res, ApiCaller caller);
	
}
