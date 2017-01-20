package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Variant;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * VariantTest
 */
public class VariantTest extends IntegrationTest<Variant> {

	@Override
	public ApiResponse<Variant> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Variant> crudReadTest(Variant res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Variant> crudUpdateTest(Variant oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Variant> crudDeleteTest(Variant res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		VariantTest test = new VariantTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
