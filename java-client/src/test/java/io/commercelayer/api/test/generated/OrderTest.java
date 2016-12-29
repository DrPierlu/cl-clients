package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Order;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * OrderTest
 */
public class OrderTest extends IntegrationTest<Order> {

	@Override
	public ApiResponse<Order> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Order> testRead(Order res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Order> testUpdate(Order oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Order> testDelete(Order res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		OrderTest test = new OrderTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
