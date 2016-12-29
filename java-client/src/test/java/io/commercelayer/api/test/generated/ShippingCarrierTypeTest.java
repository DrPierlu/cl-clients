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
	public ApiResponse<ShippingCarrierType> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingCarrierType> testRead(ShippingCarrierType res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingCarrierType> testUpdate(ShippingCarrierType oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingCarrierType> testDelete(ShippingCarrierType res, ApiCaller caller) {
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
