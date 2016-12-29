package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.LineItemStock;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * LineItemStockTest
 */
public class LineItemStockTest extends IntegrationTest<LineItemStock> {

	@Override
	public ApiResponse<LineItemStock> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<LineItemStock> testRead(LineItemStock res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<LineItemStock> testUpdate(LineItemStock oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<LineItemStock> testDelete(LineItemStock res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		LineItemStockTest test = new LineItemStockTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
