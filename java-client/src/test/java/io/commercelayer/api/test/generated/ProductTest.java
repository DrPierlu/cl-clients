package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Product;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ProductTest
 */
public class ProductTest extends IntegrationTest<Product> {

	@Override
	public ApiResponse<Product> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Product> testRead(Product res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Product> testUpdate(Product oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Product> testDelete(Product res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ProductTest test = new ProductTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
