package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.OrderValidator;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * OrderValidatorTest
 */
public class OrderValidatorTest extends IntegrationTest<OrderValidator> {

	@Override
	public ApiResponse<OrderValidator> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<OrderValidator> testRead(OrderValidator res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<OrderValidator> testUpdate(OrderValidator oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<OrderValidator> testDelete(OrderValidator res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		OrderValidatorTest test = new OrderValidatorTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
