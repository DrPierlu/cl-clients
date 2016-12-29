package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ProductType;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * ProductTypeTest
 */
public class ProductTypeTest extends IntegrationTest<ProductType> {

	@Override
	public ApiResponse<ProductType> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ProductType> testRead(ProductType res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ProductType> testUpdate(ProductType oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ProductType> testDelete(ProductType res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ProductTypeTest test = new ProductTypeTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
