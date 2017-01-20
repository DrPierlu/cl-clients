package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.StockLocation;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * StockLocationTest
 */
public class StockLocationTest extends IntegrationTest<StockLocation> {

	@Override
	public ApiResponse<StockLocation> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<StockLocation> crudReadTest(StockLocation res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<StockLocation> crudUpdateTest(StockLocation oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<StockLocation> crudDeleteTest(StockLocation res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		StockLocationTest test = new StockLocationTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
