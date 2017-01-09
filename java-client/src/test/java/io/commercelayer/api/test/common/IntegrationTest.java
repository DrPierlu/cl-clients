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
		
		ApiResponse<T> insRes = testCreate(caller);
		
		ApiResponse<T> getRes = testRead(insRes.getResource(), caller);
		
		ApiResponse<T> updRes = testUpdate(getRes.getResource(), caller);
		
		@SuppressWarnings("unused")
		ApiResponse<T> delRes = testDelete(updRes.getResource(), caller);
		
	}
	
	protected abstract ApiResponse<T> testCreate(ApiCaller caller);
	
	protected abstract ApiResponse<T> testRead(T res, ApiCaller caller);
	
	protected abstract ApiResponse<T> testUpdate(T oldRes, ApiCaller caller);
	
	protected abstract ApiResponse<T> testDelete(T res, ApiCaller caller);
	
}
