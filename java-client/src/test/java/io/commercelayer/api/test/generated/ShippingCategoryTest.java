package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingCategory;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ShippingCategoryTest
 */
public class ShippingCategoryTest extends IntegrationTest<ShippingCategory> {

	@Override
	public ApiResponse<ShippingCategory> testCreate(ApiCaller caller) {
		throw new TestException("ShippingCategoryTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingCategory> testRead(ShippingCategory res, ApiCaller caller) {
		throw new TestException("ShippingCategoryTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<ShippingCategory> testUpdate(ShippingCategory oldRes, ApiCaller caller) {
		throw new TestException("ShippingCategoryTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingCategory> testDelete(ShippingCategory res, ApiCaller caller) {
		throw new TestException("ShippingCategoryTest.testDelete not implemented");
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
