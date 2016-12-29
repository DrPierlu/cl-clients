package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.OptionValue;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * OptionValueTest
 */
public class OptionValueTest extends IntegrationTest<OptionValue> {

	@Override
	public ApiResponse<OptionValue> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<OptionValue> testRead(OptionValue res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<OptionValue> testUpdate(OptionValue oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<OptionValue> testDelete(OptionValue res, ApiCaller caller) {
		return null;
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
