package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.OptionValue;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * OptionValueTest
 */
public class OptionValueTest extends IntegrationTest<OptionValue> {

	@Override
	public ApiResponse<OptionValue> testCreate(ApiCaller caller) {
		throw new TestException("OptionValueTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<OptionValue> testRead(OptionValue res, ApiCaller caller) {
		throw new TestException("OptionValueTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<OptionValue> testUpdate(OptionValue oldRes, ApiCaller caller) {
		throw new TestException("OptionValueTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<OptionValue> testDelete(OptionValue res, ApiCaller caller) {
		throw new TestException("OptionValueTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		OptionValueTest test = new OptionValueTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
