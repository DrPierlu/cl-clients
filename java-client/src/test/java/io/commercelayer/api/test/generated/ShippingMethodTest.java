package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingMethod;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ShippingMethodTest
 */
public class ShippingMethodTest extends IntegrationTest<ShippingMethod> {

	@Override
	public ApiResponse<ShippingMethod> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingMethod> crudReadTest(ShippingMethod res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingMethod> crudUpdateTest(ShippingMethod oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingMethod> crudDeleteTest(ShippingMethod res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ShippingMethodTest test = new ShippingMethodTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
