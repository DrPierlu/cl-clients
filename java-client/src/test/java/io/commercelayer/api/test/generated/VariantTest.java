package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Variant;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * VariantTest
 */
public class VariantTest extends IntegrationTest<Variant> {

	@Override
	public ApiResponse<Variant> testCreate(ApiCaller caller) {
		throw new TestException("VariantTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Variant> testRead(Variant res, ApiCaller caller) {
		throw new TestException("VariantTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Variant> testUpdate(Variant oldRes, ApiCaller caller) {
		throw new TestException("VariantTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Variant> testDelete(Variant res, ApiCaller caller) {
		throw new TestException("VariantTest.testDelete not implemented");
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
