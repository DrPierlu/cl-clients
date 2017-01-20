package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PriceList;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * PriceListTest
 */
public class PriceListTest extends IntegrationTest<PriceList> {

	@Override
	public ApiResponse<PriceList> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PriceList> crudReadTest(PriceList res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PriceList> crudUpdateTest(PriceList oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PriceList> crudDeleteTest(PriceList res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		PriceListTest test = new PriceListTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
