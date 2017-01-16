package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Application;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ApplicationTest
 */
public class ApplicationTest extends IntegrationTest<Application> {

	@Override
	public ApiResponse<Application> testCreate(ApiCaller caller) {
		throw new TestException("ApplicationTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Application> testRead(Application res, ApiCaller caller) {
		throw new TestException("ApplicationTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Application> testUpdate(Application oldRes, ApiCaller caller) {
		throw new TestException("ApplicationTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Application> testDelete(Application res, ApiCaller caller) {
		throw new TestException("ApplicationTest.testDelete not implemented");
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
