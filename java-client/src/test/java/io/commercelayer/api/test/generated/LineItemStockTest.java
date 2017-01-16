package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.LineItemStock;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * LineItemStockTest
 */
public class LineItemStockTest extends IntegrationTest<LineItemStock> {

	@Override
	public ApiResponse<LineItemStock> testCreate(ApiCaller caller) {
		throw new TestException("LineItemStockTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<LineItemStock> testRead(LineItemStock res, ApiCaller caller) {
		throw new TestException("LineItemStockTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<LineItemStock> testUpdate(LineItemStock oldRes, ApiCaller caller) {
		throw new TestException("LineItemStockTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<LineItemStock> testDelete(LineItemStock res, ApiCaller caller) {
		throw new TestException("LineItemStockTest.testDelete not implemented");
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
