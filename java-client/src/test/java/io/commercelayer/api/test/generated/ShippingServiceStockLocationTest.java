package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingServiceStockLocation;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ShippingServiceStockLocationTest
 */
public class ShippingServiceStockLocationTest extends IntegrationTest<ShippingServiceStockLocation> {

	@Override
	public ApiResponse<ShippingServiceStockLocation> testCreate(ApiCaller caller) {
		throw new TestException("ShippingServiceStockLocationTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingServiceStockLocation> testRead(ShippingServiceStockLocation res, ApiCaller caller) {
		throw new TestException("ShippingServiceStockLocationTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<ShippingServiceStockLocation> testUpdate(ShippingServiceStockLocation oldRes, ApiCaller caller) {
		throw new TestException("ShippingServiceStockLocationTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<ShippingServiceStockLocation> testDelete(ShippingServiceStockLocation res, ApiCaller caller) {
		throw new TestException("ShippingServiceStockLocationTest.testDelete not implemented");
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
