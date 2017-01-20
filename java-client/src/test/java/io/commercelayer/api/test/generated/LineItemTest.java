package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.LineItem;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * LineItemTest
 */
public class LineItemTest extends IntegrationTest<LineItem> {

	@Override
	public ApiResponse<LineItem> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<LineItem> crudReadTest(LineItem res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<LineItem> crudUpdateTest(LineItem oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<LineItem> crudDeleteTest(LineItem res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		LineItemTest test = new LineItemTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
