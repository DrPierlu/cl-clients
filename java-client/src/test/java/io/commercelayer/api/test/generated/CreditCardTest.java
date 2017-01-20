package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.CreditCard;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * CreditCardTest
 */
public class CreditCardTest extends IntegrationTest<CreditCard> {

	@Override
	public ApiResponse<CreditCard> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<CreditCard> testRead(CreditCard res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<CreditCard> testUpdate(CreditCard oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<CreditCard> testDelete(CreditCard res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		CreditCardTest test = new CreditCardTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
