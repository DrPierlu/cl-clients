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
	public ApiResponse<ShippingPackage> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingPackage> crudReadTest(ShippingPackage res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingPackage> crudUpdateTest(ShippingPackage oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingPackage> crudDeleteTest(ShippingPackage res, ApiCaller caller) {
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
