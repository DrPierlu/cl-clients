package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Currency;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * CurrencyTest
 */
public class CurrencyTest extends IntegrationTest<Currency> {

	@Override
	public ApiResponse<Currency> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Currency> crudReadTest(Currency res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Currency> crudUpdateTest(Currency oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Currency> crudDeleteTest(Currency res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		CurrencyTest test = new CurrencyTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
