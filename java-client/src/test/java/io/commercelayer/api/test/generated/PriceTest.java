package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Price;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * PriceTest
 */
public class PriceTest extends IntegrationTest<Price> {

	@Override
	public ApiResponse<Price> testCreate(ApiCaller caller) {
		throw new TestException("PriceTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Price> testRead(Price res, ApiCaller caller) {
		throw new TestException("PriceTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Price> testUpdate(Price oldRes, ApiCaller caller) {
		throw new TestException("PriceTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Price> testDelete(Price res, ApiCaller caller) {
		throw new TestException("PriceTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		PriceTest test = new PriceTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
