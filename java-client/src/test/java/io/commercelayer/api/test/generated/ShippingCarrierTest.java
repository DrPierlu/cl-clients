package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingCarrier;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ShippingCarrierTest
 */
public class ShippingCarrierTest extends IntegrationTest<ShippingCarrier> {

	@Override
	public ApiResponse<ShippingCarrier> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingCarrier> crudReadTest(ShippingCarrier res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingCarrier> crudUpdateTest(ShippingCarrier oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingCarrier> crudDeleteTest(ShippingCarrier res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ShippingCarrierTest test = new ShippingCarrierTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
