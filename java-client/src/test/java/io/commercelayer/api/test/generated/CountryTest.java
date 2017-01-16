package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Country;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * CountryTest
 */
public class CountryTest extends IntegrationTest<Country> {

	@Override
	public ApiResponse<Country> testCreate(ApiCaller caller) {
		throw new TestException("CountryTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Country> testRead(Country res, ApiCaller caller) {
		throw new TestException("CountryTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Country> testUpdate(Country oldRes, ApiCaller caller) {
		throw new TestException("CountryTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Country> testDelete(Country res, ApiCaller caller) {
		throw new TestException("CountryTest.testDelete not implemented");
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
