package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingZone;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ShippingZoneTest
 */
public class ShippingZoneTest extends IntegrationTest<ShippingZone> {

	@Override
	public ApiResponse<ShippingZone> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingZone> crudReadTest(ShippingZone res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingZone> crudUpdateTest(ShippingZone oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingZone> crudDeleteTest(ShippingZone res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ShippingZoneTest test = new ShippingZoneTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
