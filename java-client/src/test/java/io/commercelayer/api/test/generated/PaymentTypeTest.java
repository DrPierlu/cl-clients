package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PaymentType;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * PaymentTypeTest
 */
public class PaymentTypeTest extends IntegrationTest<PaymentType> {

	@Override
	public ApiResponse<PaymentType> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PaymentType> testRead(PaymentType res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PaymentType> testUpdate(PaymentType oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PaymentType> testDelete(PaymentType res, ApiCaller caller) {
		return null;
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
