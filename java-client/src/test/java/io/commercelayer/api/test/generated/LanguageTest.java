package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Language;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * LanguageTest
 */
public class LanguageTest extends IntegrationTest<Language> {

	@Override
	public ApiResponse<Language> testCreate(ApiCaller caller) {
		throw new TestException("LanguageTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Language> testRead(Language res, ApiCaller caller) {
		throw new TestException("LanguageTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Language> testUpdate(Language oldRes, ApiCaller caller) {
		throw new TestException("LanguageTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Language> testDelete(Language res, ApiCaller caller) {
		throw new TestException("LanguageTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		LanguageTest test = new LanguageTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
