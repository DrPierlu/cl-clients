package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.OptionType;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * OptionTypeTest
 */
public class OptionTypeTest extends IntegrationTest<OptionType> {

	@Override
	public ApiResponse<OptionType> testCreate(ApiCaller caller) {
		throw new TestException("OptionTypeTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<OptionType> testRead(OptionType res, ApiCaller caller) {
		throw new TestException("OptionTypeTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<OptionType> testUpdate(OptionType oldRes, ApiCaller caller) {
		throw new TestException("OptionTypeTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<OptionType> testDelete(OptionType res, ApiCaller caller) {
		throw new TestException("OptionTypeTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		OptionTypeTest test = new OptionTypeTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
