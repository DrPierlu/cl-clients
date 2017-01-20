package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.StockItem;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * StockItemTest
 */
public class StockItemTest extends IntegrationTest<StockItem> {

	@Override
	public ApiResponse<StockItem> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<StockItem> crudReadTest(StockItem res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<StockItem> crudUpdateTest(StockItem oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<StockItem> crudDeleteTest(StockItem res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		StockItemTest test = new StockItemTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
