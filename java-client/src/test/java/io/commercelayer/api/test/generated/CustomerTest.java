package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Customer;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * CustomerTest
 */
public class CustomerTest extends IntegrationTest<Customer> {

	@Override
	public ApiResponse<Customer> testCreate(ApiCaller caller) {
		throw new TestException("CustomerTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Customer> testRead(Customer res, ApiCaller caller) {
		throw new TestException("CustomerTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Customer> testUpdate(Customer oldRes, ApiCaller caller) {
		throw new TestException("CustomerTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Customer> testDelete(Customer res, ApiCaller caller) {
		throw new TestException("CustomerTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		CustomerTest test = new CustomerTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
