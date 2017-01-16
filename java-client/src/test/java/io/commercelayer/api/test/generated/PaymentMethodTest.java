package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PaymentMethod;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * PaymentMethodTest
 */
public class PaymentMethodTest extends IntegrationTest<PaymentMethod> {

	@Override
	public ApiResponse<PaymentMethod> testCreate(ApiCaller caller) {
		throw new TestException("PaymentMethodTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<PaymentMethod> testRead(PaymentMethod res, ApiCaller caller) {
		throw new TestException("PaymentMethodTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<PaymentMethod> testUpdate(PaymentMethod oldRes, ApiCaller caller) {
		throw new TestException("PaymentMethodTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<PaymentMethod> testDelete(PaymentMethod res, ApiCaller caller) {
		throw new TestException("PaymentMethodTest.testDelete not implemented");
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
