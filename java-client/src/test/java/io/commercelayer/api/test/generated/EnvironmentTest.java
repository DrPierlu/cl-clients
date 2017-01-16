package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Environment;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * EnvironmentTest
 */
public class EnvironmentTest extends IntegrationTest<Environment> {

	@Override
	public ApiResponse<Environment> testCreate(ApiCaller caller) {
		throw new TestException("EnvironmentTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Environment> testRead(Environment res, ApiCaller caller) {
		throw new TestException("EnvironmentTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Environment> testUpdate(Environment oldRes, ApiCaller caller) {
		throw new TestException("EnvironmentTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Environment> testDelete(Environment res, ApiCaller caller) {
		throw new TestException("EnvironmentTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		EnvironmentTest test = new EnvironmentTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
