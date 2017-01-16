package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingCarrierType;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ShippingCarrierTypeTest
 */
public class ShippingCarrierTypeTest extends IntegrationTest<ShippingCarrierType> {

	@Override
	public ApiResponse<ShippingCarrierType> testCreate(ApiCaller caller) {
		throw new TestException("ShippingCarrierTypeTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingCarrierType> testRead(ShippingCarrierType res, ApiCaller caller) {
		throw new TestException("ShippingCarrierTypeTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<ShippingCarrierType> testUpdate(ShippingCarrierType oldRes, ApiCaller caller) {
		throw new TestException("ShippingCarrierTypeTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingCarrierType> testDelete(ShippingCarrierType res, ApiCaller caller) {
		throw new TestException("ShippingCarrierTypeTest.testDelete not implemented");
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
