package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingServiceZone;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ShippingServiceZoneTest
 */
public class ShippingServiceZoneTest extends IntegrationTest<ShippingServiceZone> {

	@Override
	public ApiResponse<ShippingServiceZone> testCreate(ApiCaller caller) {
		throw new TestException("ShippingServiceZoneTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingServiceZone> testRead(ShippingServiceZone res, ApiCaller caller) {
		throw new TestException("ShippingServiceZoneTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<ShippingServiceZone> testUpdate(ShippingServiceZone oldRes, ApiCaller caller) {
		throw new TestException("ShippingServiceZoneTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingServiceZone> testDelete(ShippingServiceZone res, ApiCaller caller) {
		throw new TestException("ShippingServiceZoneTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		ShippingServiceZoneTest test = new ShippingServiceZoneTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
