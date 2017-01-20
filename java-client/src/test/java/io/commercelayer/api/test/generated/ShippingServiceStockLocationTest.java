package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingServiceStockLocation;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ShippingServiceStockLocationTest
 */
public class ShippingServiceStockLocationTest extends IntegrationTest<ShippingServiceStockLocation> {

	@Override
	public ApiResponse<ShippingServiceStockLocation> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingServiceStockLocation> crudReadTest(ShippingServiceStockLocation res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingServiceStockLocation> crudUpdateTest(ShippingServiceStockLocation oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingServiceStockLocation> crudDeleteTest(ShippingServiceStockLocation res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ShippingServiceStockLocationTest test = new ShippingServiceStockLocationTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
