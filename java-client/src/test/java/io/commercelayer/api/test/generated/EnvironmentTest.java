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
	public ApiResponse<Environment> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Environment> testRead(Environment res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Environment> testUpdate(Environment oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Environment> testDelete(Environment res, ApiCaller caller) {
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
