package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.MarketStockLocation;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * MarketStockLocationTest
 */
public class MarketStockLocationTest extends IntegrationTest<MarketStockLocation> {

	@Override
	public ApiResponse<MarketStockLocation> testCreate(ApiCaller caller) {
		throw new TestException("MarketStockLocationTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<MarketStockLocation> testRead(MarketStockLocation res, ApiCaller caller) {
		throw new TestException("MarketStockLocationTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<MarketStockLocation> testUpdate(MarketStockLocation oldRes, ApiCaller caller) {
		throw new TestException("MarketStockLocationTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<MarketStockLocation> testDelete(MarketStockLocation res, ApiCaller caller) {
		throw new TestException("MarketStockLocationTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		MarketStockLocationTest test = new MarketStockLocationTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
