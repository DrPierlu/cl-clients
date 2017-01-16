package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Catalog;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * CatalogTest
 */
public class CatalogTest extends IntegrationTest<Catalog> {

	@Override
	public ApiResponse<Catalog> testCreate(ApiCaller caller) {
		throw new TestException("CatalogTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Catalog> testRead(Catalog res, ApiCaller caller) {
		throw new TestException("CatalogTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Catalog> testUpdate(Catalog oldRes, ApiCaller caller) {
		throw new TestException("CatalogTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Catalog> testDelete(Catalog res, ApiCaller caller) {
		throw new TestException("CatalogTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		CatalogTest test = new CatalogTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
