package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Order;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * OrderTest
 */
public class OrderTest extends IntegrationTest<Order> {

	@Override
	public ApiResponse<Order> testCreate(ApiCaller caller) {
		throw new TestException("OrderTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Order> testRead(Order res, ApiCaller caller) {
		throw new TestException("OrderTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Order> testUpdate(Order oldRes, ApiCaller caller) {
		throw new TestException("OrderTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Order> testDelete(Order res, ApiCaller caller) {
		throw new TestException("OrderTest.testDelete not implemented");
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
