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
	public ApiResponse<StockItem> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<StockItem> testRead(StockItem res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<StockItem> testUpdate(StockItem oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<StockItem> testDelete(StockItem res, ApiCaller caller) {
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
