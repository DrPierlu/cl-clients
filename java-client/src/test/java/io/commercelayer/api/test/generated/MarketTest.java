package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Market;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * MarketTest
 */
public class MarketTest extends IntegrationTest<Market> {

	@Override
	public ApiResponse<Market> testCreate(ApiCaller caller) {
		throw new TestException("MarketTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Market> testRead(Market res, ApiCaller caller) {
		throw new TestException("MarketTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Market> testUpdate(Market oldRes, ApiCaller caller) {
		throw new TestException("MarketTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Market> testDelete(Market res, ApiCaller caller) {
		throw new TestException("MarketTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		MarketTest test = new MarketTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
