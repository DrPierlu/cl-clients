package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.LineItem;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * LineItemTest
 */
public class LineItemTest extends IntegrationTest<LineItem> {

	@Override
	public ApiResponse<LineItem> testCreate(ApiCaller caller) {
		throw new TestException("LineItemTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<LineItem> testRead(LineItem res, ApiCaller caller) {
		throw new TestException("LineItemTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<LineItem> testUpdate(LineItem oldRes, ApiCaller caller) {
		throw new TestException("LineItemTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<LineItem> testDelete(LineItem res, ApiCaller caller) {
		throw new TestException("LineItemTest.testDelete not implemented");
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
