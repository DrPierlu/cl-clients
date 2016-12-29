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
	public ApiResponse<StockLocation> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<StockLocation> testRead(StockLocation res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<StockLocation> testUpdate(StockLocation oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<StockLocation> testDelete(StockLocation res, ApiCaller caller) {
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
