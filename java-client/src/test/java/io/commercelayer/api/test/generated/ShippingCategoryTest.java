package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingCategory;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ShippingCategoryTest
 */
public class ShippingCategoryTest extends IntegrationTest<ShippingCategory> {

	@Override
	public ApiResponse<ShippingCategory> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingCategory> crudReadTest(ShippingCategory res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingCategory> crudUpdateTest(ShippingCategory oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingCategory> crudDeleteTest(ShippingCategory res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ShippingCategoryTest test = new ShippingCategoryTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
