package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingService;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ShippingServiceTest
 */
public class ShippingServiceTest extends IntegrationTest<ShippingService> {

	@Override
	public ApiResponse<ShippingService> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingService> crudReadTest(ShippingService res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingService> crudUpdateTest(ShippingService oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingService> crudDeleteTest(ShippingService res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ShippingServiceTest test = new ShippingServiceTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
