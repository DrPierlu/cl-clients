package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.CountryLanguage;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * CountryLanguageTest
 */
public class CountryLanguageTest extends IntegrationTest<CountryLanguage> {

	@Override
	public ApiResponse<CountryLanguage> testCreate(ApiCaller caller) {
		throw new TestException("CountryLanguageTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<CountryLanguage> testRead(CountryLanguage res, ApiCaller caller) {
		throw new TestException("CountryLanguageTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<CountryLanguage> testUpdate(CountryLanguage oldRes, ApiCaller caller) {
		throw new TestException("CountryLanguageTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<CountryLanguage> testDelete(CountryLanguage res, ApiCaller caller) {
		throw new TestException("CountryLanguageTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		CountryLanguageTest test = new CountryLanguageTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
