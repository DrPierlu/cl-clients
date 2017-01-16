package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingCarrier;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ShippingCarrierTest
 */
public class ShippingCarrierTest extends IntegrationTest<ShippingCarrier> {

	@Override
	public ApiResponse<ShippingCarrier> testCreate(ApiCaller caller) {
		throw new TestException("ShippingCarrierTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingCarrier> testRead(ShippingCarrier res, ApiCaller caller) {
		throw new TestException("ShippingCarrierTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<ShippingCarrier> testUpdate(ShippingCarrier oldRes, ApiCaller caller) {
		throw new TestException("ShippingCarrierTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingCarrier> testDelete(ShippingCarrier res, ApiCaller caller) {
		throw new TestException("ShippingCarrierTest.testDelete not implemented");
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
