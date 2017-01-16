package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.VariantOption;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * VariantOptionTest
 */
public class VariantOptionTest extends IntegrationTest<VariantOption> {

	@Override
	public ApiResponse<VariantOption> testCreate(ApiCaller caller) {
		throw new TestException("VariantOptionTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<VariantOption> testRead(VariantOption res, ApiCaller caller) {
		throw new TestException("VariantOptionTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<VariantOption> testUpdate(VariantOption oldRes, ApiCaller caller) {
		throw new TestException("VariantOptionTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<VariantOption> testDelete(VariantOption res, ApiCaller caller) {
		throw new TestException("VariantOptionTest.testDelete not implemented");
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
