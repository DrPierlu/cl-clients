package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PaypalAccount;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * PaypalAccountTest
 */
public class PaypalAccountTest extends IntegrationTest<PaypalAccount> {

	@Override
	public ApiResponse<PaypalAccount> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PaypalAccount> crudReadTest(PaypalAccount res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PaypalAccount> crudUpdateTest(PaypalAccount oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PaypalAccount> crudDeleteTest(PaypalAccount res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		PaypalAccountTest test = new PaypalAccountTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
