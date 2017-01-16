package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Currency;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * CurrencyTest
 */
public class CurrencyTest extends IntegrationTest<Currency> {

	@Override
	public ApiResponse<Currency> testCreate(ApiCaller caller) {
		throw new TestException("CurrencyTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Currency> testRead(Currency res, ApiCaller caller) {
		throw new TestException("CurrencyTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Currency> testUpdate(Currency oldRes, ApiCaller caller) {
		throw new TestException("CurrencyTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Currency> testDelete(Currency res, ApiCaller caller) {
		throw new TestException("CurrencyTest.testDelete not implemented");
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
