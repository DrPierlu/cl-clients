package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PaymentMethod;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * PaymentMethodTest
 */
public class PaymentMethodTest extends IntegrationTest<PaymentMethod> {

	@Override
	public ApiResponse<PaymentMethod> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PaymentMethod> crudReadTest(PaymentMethod res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PaymentMethod> crudUpdateTest(PaymentMethod oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PaymentMethod> crudDeleteTest(PaymentMethod res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		PaymentMethodTest test = new PaymentMethodTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
