package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.MarketPaymentType;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * MarketPaymentTypeTest
 */
public class MarketPaymentTypeTest extends IntegrationTest<MarketPaymentType> {

	@Override
	public ApiResponse<MarketPaymentType> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<MarketPaymentType> crudReadTest(MarketPaymentType res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<MarketPaymentType> crudUpdateTest(MarketPaymentType oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<MarketPaymentType> crudDeleteTest(MarketPaymentType res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		MarketPaymentTypeTest test = new MarketPaymentTypeTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
