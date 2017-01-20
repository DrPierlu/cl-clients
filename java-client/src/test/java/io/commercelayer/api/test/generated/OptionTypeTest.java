package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.OptionType;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * OptionTypeTest
 */
public class OptionTypeTest extends IntegrationTest<OptionType> {

	@Override
	public ApiResponse<OptionType> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<OptionType> crudReadTest(OptionType res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<OptionType> crudUpdateTest(OptionType oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<OptionType> crudDeleteTest(OptionType res, ApiCaller caller) {
		return null;
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
