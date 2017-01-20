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
	public ApiResponse<Gateway> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Gateway> testRead(Gateway res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Gateway> testUpdate(Gateway oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Gateway> testDelete(Gateway res, ApiCaller caller) {
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
