package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.CountryGroup;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * CountryGroupTest
 */
public class CountryGroupTest extends IntegrationTest<CountryGroup> {

	@Override
	public ApiResponse<CountryGroup> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<CountryGroup> testRead(CountryGroup res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<CountryGroup> testUpdate(CountryGroup oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<CountryGroup> testDelete(CountryGroup res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		CountryGroupTest test = new CountryGroupTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
