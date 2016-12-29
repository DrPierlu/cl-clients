package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingPackage;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * ShippingPackageTest
 */
public class ShippingPackageTest extends IntegrationTest<ShippingPackage> {

	@Override
	public ApiResponse<ShippingPackage> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingPackage> testRead(ShippingPackage res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingPackage> testUpdate(ShippingPackage oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingPackage> testDelete(ShippingPackage res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ShippingPackageTest test = new ShippingPackageTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
