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
	public ApiResponse<ShippingZone> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingZone> testRead(ShippingZone res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingZone> testUpdate(ShippingZone oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingZone> testDelete(ShippingZone res, ApiCaller caller) {
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
