package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingMethod;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ShippingMethodTest
 */
public class ShippingMethodTest extends IntegrationTest<ShippingMethod> {

	@Override
	public ApiResponse<ShippingMethod> testCreate(ApiCaller caller) {
		throw new TestException("ShippingMethodTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingMethod> testRead(ShippingMethod res, ApiCaller caller) {
		throw new TestException("ShippingMethodTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<ShippingMethod> testUpdate(ShippingMethod oldRes, ApiCaller caller) {
		throw new TestException("ShippingMethodTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingMethod> testDelete(ShippingMethod res, ApiCaller caller) {
		throw new TestException("ShippingMethodTest.testDelete not implemented");
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
