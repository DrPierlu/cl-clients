package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Environment;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * EnvironmentTest
 */
public class EnvironmentTest extends IntegrationTest<Environment> {

	@Override
	public ApiResponse<Environment> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Environment> crudReadTest(Environment res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Environment> crudUpdateTest(Environment oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Environment> crudDeleteTest(Environment res, ApiCaller caller) {
		return null;
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
