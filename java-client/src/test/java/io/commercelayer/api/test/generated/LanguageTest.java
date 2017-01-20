package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Language;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * LanguageTest
 */
public class LanguageTest extends IntegrationTest<Language> {

	@Override
	public ApiResponse<Language> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Language> crudReadTest(Language res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Language> crudUpdateTest(Language oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Language> crudDeleteTest(Language res, ApiCaller caller) {
		return null;
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
