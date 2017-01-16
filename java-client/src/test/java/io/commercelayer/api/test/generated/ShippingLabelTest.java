package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingLabel;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ShippingLabelTest
 */
public class ShippingLabelTest extends IntegrationTest<ShippingLabel> {

	@Override
	public ApiResponse<ShippingLabel> testCreate(ApiCaller caller) {
		throw new TestException("ShippingLabelTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingLabel> testRead(ShippingLabel res, ApiCaller caller) {
		throw new TestException("ShippingLabelTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<ShippingLabel> testUpdate(ShippingLabel oldRes, ApiCaller caller) {
		throw new TestException("ShippingLabelTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingLabel> testDelete(ShippingLabel res, ApiCaller caller) {
		throw new TestException("ShippingLabelTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		ShippingLabelTest test = new ShippingLabelTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
