package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingService;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ShippingServiceTest
 */
public class ShippingServiceTest extends IntegrationTest<ShippingService> {

	@Override
	public ApiResponse<ShippingService> testCreate(ApiCaller caller) {
		throw new TestException("ShippingServiceTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingService> testRead(ShippingService res, ApiCaller caller) {
		throw new TestException("ShippingServiceTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<ShippingService> testUpdate(ShippingService oldRes, ApiCaller caller) {
		throw new TestException("ShippingServiceTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingService> testDelete(ShippingService res, ApiCaller caller) {
		throw new TestException("ShippingServiceTest.testDelete not implemented");
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
