package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingCarrierType;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ShippingCarrierTypeTest
 */
public class ShippingCarrierTypeTest extends IntegrationTest<ShippingCarrierType> {

	@Override
	public ApiResponse<ShippingCarrierType> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingCarrierType> crudReadTest(ShippingCarrierType res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingCarrierType> crudUpdateTest(ShippingCarrierType oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingCarrierType> crudDeleteTest(ShippingCarrierType res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ShippingCarrierTypeTest test = new ShippingCarrierTypeTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
