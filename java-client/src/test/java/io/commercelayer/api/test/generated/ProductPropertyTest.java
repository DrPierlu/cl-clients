package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ProductProperty;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ProductPropertyTest
 */
public class ProductPropertyTest extends IntegrationTest<ProductProperty> {

	@Override
	public ApiResponse<ProductProperty> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ProductProperty> crudReadTest(ProductProperty res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ProductProperty> crudUpdateTest(ProductProperty oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ProductProperty> crudDeleteTest(ProductProperty res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ProductPropertyTest test = new ProductPropertyTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
