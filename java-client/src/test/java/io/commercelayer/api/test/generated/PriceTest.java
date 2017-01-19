package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Price;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * PriceTest
 */
public class PriceTest extends IntegrationTest<Price> {

	@Override
	public ApiResponse<Price> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Price> testRead(Price res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Price> testUpdate(Price oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Price> testDelete(Price res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		PriceTest test = new PriceTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
