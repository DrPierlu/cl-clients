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
	public ApiResponse<ShippingServiceCategory> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingServiceCategory> testRead(ShippingServiceCategory res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingServiceCategory> testUpdate(ShippingServiceCategory oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingServiceCategory> testDelete(ShippingServiceCategory res, ApiCaller caller) {
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
