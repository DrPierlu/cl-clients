package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PaymentType;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * PaymentTypeTest
 */
public class PaymentTypeTest extends IntegrationTest<PaymentType> {

	@Override
	public ApiResponse<PaymentType> testCreate(ApiCaller caller) {
		throw new TestException("PaymentTypeTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<PaymentType> testRead(PaymentType res, ApiCaller caller) {
		throw new TestException("PaymentTypeTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<PaymentType> testUpdate(PaymentType oldRes, ApiCaller caller) {
		throw new TestException("PaymentTypeTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<PaymentType> testDelete(PaymentType res, ApiCaller caller) {
		throw new TestException("PaymentTypeTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		PaymentTypeTest test = new PaymentTypeTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
