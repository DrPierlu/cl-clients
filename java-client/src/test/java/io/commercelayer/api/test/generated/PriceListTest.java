package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PriceList;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * PriceListTest
 */
public class PriceListTest extends IntegrationTest<PriceList> {

	@Override
	public ApiResponse<PriceList> testCreate(ApiCaller caller) {
		throw new TestException("PriceListTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<PriceList> testRead(PriceList res, ApiCaller caller) {
		throw new TestException("PriceListTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<PriceList> testUpdate(PriceList oldRes, ApiCaller caller) {
		throw new TestException("PriceListTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<PriceList> testDelete(PriceList res, ApiCaller caller) {
		throw new TestException("PriceListTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		PriceListTest test = new PriceListTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
