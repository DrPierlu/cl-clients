package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Market;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * MarketTest
 */
public class MarketTest extends IntegrationTest<Market> {

	@Override
	public ApiResponse<Market> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Market> crudReadTest(Market res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Market> crudUpdateTest(Market oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Market> crudDeleteTest(Market res, ApiCaller caller) {
		return null;
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
