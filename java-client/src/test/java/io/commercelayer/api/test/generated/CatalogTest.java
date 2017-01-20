package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Catalog;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * CatalogTest
 */
public class CatalogTest extends IntegrationTest<Catalog> {

	@Override
	public ApiResponse<Catalog> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Catalog> crudReadTest(Catalog res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Catalog> crudUpdateTest(Catalog oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Catalog> crudDeleteTest(Catalog res, ApiCaller caller) {
		return null;
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
