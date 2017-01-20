package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.State;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * StateTest
 */
public class StateTest extends IntegrationTest<State> {

	@Override
	public ApiResponse<State> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<State> crudReadTest(State res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<State> crudUpdateTest(State oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<State> crudDeleteTest(State res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		StateTest test = new StateTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
