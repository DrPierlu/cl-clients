package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingServiceCategory;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ShippingServiceCategoryTest
 */
public class ShippingServiceCategoryTest extends IntegrationTest<ShippingServiceCategory> {

	@Override
	public ApiResponse<ShippingServiceCategory> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingServiceCategory> crudReadTest(ShippingServiceCategory res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingServiceCategory> crudUpdateTest(ShippingServiceCategory oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingServiceCategory> crudDeleteTest(ShippingServiceCategory res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ShippingServiceCategoryTest test = new ShippingServiceCategoryTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
