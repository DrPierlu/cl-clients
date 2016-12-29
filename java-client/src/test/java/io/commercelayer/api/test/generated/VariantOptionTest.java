package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.VariantOption;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * VariantOptionTest
 */
public class VariantOptionTest extends IntegrationTest<VariantOption> {

	@Override
	public ApiResponse<VariantOption> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<VariantOption> testRead(VariantOption res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<VariantOption> testUpdate(VariantOption oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<VariantOption> testDelete(VariantOption res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		VariantOptionTest test = new VariantOptionTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
