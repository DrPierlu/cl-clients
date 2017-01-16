package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.State;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * StateTest
 */
public class StateTest extends IntegrationTest<State> {

	@Override
	public ApiResponse<State> testCreate(ApiCaller caller) {
		throw new TestException("StateTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<State> testRead(State res, ApiCaller caller) {
		throw new TestException("StateTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<State> testUpdate(State oldRes, ApiCaller caller) {
		throw new TestException("StateTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<State> testDelete(State res, ApiCaller caller) {
		throw new TestException("StateTest.testDelete not implemented");
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
