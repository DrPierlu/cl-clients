package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.OrderValidator;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * OrderValidatorTest
 */
public class OrderValidatorTest extends IntegrationTest<OrderValidator> {

	@Override
	public ApiResponse<OrderValidator> testCreate(ApiCaller caller) {
		throw new TestException("OrderValidatorTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<OrderValidator> testRead(OrderValidator res, ApiCaller caller) {
		throw new TestException("OrderValidatorTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<OrderValidator> testUpdate(OrderValidator oldRes, ApiCaller caller) {
		throw new TestException("OrderValidatorTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<OrderValidator> testDelete(OrderValidator res, ApiCaller caller) {
		throw new TestException("OrderValidatorTest.testDelete not implemented");
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
