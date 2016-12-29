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
	public ApiResponse<ShippingService> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingService> testRead(ShippingService res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingService> testUpdate(ShippingService oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingService> testDelete(ShippingService res, ApiCaller caller) {
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
