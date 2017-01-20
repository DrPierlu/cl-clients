package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Country;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * CountryTest
 */
public class CountryTest extends IntegrationTest<Country> {

	@Override
	public ApiResponse<Country> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Country> crudReadTest(Country res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Country> crudUpdateTest(Country oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Country> crudDeleteTest(Country res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		CountryTest test = new CountryTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
