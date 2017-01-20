package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Application;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ApplicationTest
 */
public class ApplicationTest extends IntegrationTest<Application> {

	@Override
	public ApiResponse<Application> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Application> testRead(Application res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Application> testUpdate(Application oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Application> testDelete(Application res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ApplicationTest test = new ApplicationTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
