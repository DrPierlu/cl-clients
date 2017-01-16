package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.MarketShippingService;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * MarketShippingServiceTest
 */
public class MarketShippingServiceTest extends IntegrationTest<MarketShippingService> {

	@Override
	public ApiResponse<MarketShippingService> testCreate(ApiCaller caller) {
		throw new TestException("MarketShippingServiceTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<MarketShippingService> testRead(MarketShippingService res, ApiCaller caller) {
		throw new TestException("MarketShippingServiceTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<MarketShippingService> testUpdate(MarketShippingService oldRes, ApiCaller caller) {
		throw new TestException("MarketShippingServiceTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<MarketShippingService> testDelete(MarketShippingService res, ApiCaller caller) {
		throw new TestException("MarketShippingServiceTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		MarketShippingServiceTest test = new MarketShippingServiceTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
