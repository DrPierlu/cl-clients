package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Gateway;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * GatewayTest
 */
public class GatewayTest extends IntegrationTest<Gateway> {

	@Override
	public ApiResponse<Gateway> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Gateway> crudReadTest(Gateway res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Gateway> crudUpdateTest(Gateway oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Gateway> crudDeleteTest(Gateway res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		GatewayTest test = new GatewayTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
