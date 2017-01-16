package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ProductProperty;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ProductPropertyTest
 */
public class ProductPropertyTest extends IntegrationTest<ProductProperty> {

	@Override
	public ApiResponse<ProductProperty> testCreate(ApiCaller caller) {
		throw new TestException("ProductPropertyTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<ProductProperty> testRead(ProductProperty res, ApiCaller caller) {
		throw new TestException("ProductPropertyTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<ProductProperty> testUpdate(ProductProperty oldRes, ApiCaller caller) {
		throw new TestException("ProductPropertyTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<ProductProperty> testDelete(ProductProperty res, ApiCaller caller) {
		throw new TestException("ProductPropertyTest.testDelete not implemented");
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
