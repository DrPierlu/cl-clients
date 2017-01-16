package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.StockItem;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * StockItemTest
 */
public class StockItemTest extends IntegrationTest<StockItem> {

	@Override
	public ApiResponse<StockItem> testCreate(ApiCaller caller) {
		throw new TestException("StockItemTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<StockItem> testRead(StockItem res, ApiCaller caller) {
		throw new TestException("StockItemTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<StockItem> testUpdate(StockItem oldRes, ApiCaller caller) {
		throw new TestException("StockItemTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<StockItem> testDelete(StockItem res, ApiCaller caller) {
		throw new TestException("StockItemTest.testDelete not implemented");
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
