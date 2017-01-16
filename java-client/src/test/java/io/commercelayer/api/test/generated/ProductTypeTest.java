package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ProductType;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ProductTypeTest
 */
public class ProductTypeTest extends IntegrationTest<ProductType> {

	@Override
	public ApiResponse<ProductType> testCreate(ApiCaller caller) {
		throw new TestException("ProductTypeTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<ProductType> testRead(ProductType res, ApiCaller caller) {
		throw new TestException("ProductTypeTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<ProductType> testUpdate(ProductType oldRes, ApiCaller caller) {
		throw new TestException("ProductTypeTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<ProductType> testDelete(ProductType res, ApiCaller caller) {
		throw new TestException("ProductTypeTest.testDelete not implemented");
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
