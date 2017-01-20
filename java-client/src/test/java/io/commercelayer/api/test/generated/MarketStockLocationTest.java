package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.MarketStockLocation;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * MarketStockLocationTest
 */
public class MarketStockLocationTest extends IntegrationTest<MarketStockLocation> {

	@Override
	public ApiResponse<MarketStockLocation> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<MarketStockLocation> crudReadTest(MarketStockLocation res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<MarketStockLocation> crudUpdateTest(MarketStockLocation oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<MarketStockLocation> crudDeleteTest(MarketStockLocation res, ApiCaller caller) {
		return null;
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
