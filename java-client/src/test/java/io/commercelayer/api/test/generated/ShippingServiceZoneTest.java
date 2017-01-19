package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingServiceZone;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ShippingServiceZoneTest
 */
public class ShippingServiceZoneTest extends IntegrationTest<ShippingServiceZone> {

	@Override
	public ApiResponse<ShippingServiceZone> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingServiceZone> testRead(ShippingServiceZone res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingServiceZone> testUpdate(ShippingServiceZone oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingServiceZone> testDelete(ShippingServiceZone res, ApiCaller caller) {
		return null;
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
