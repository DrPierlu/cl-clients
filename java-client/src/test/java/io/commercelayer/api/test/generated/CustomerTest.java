package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Customer;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * CustomerTest
 */
public class CustomerTest extends IntegrationTest<Customer> {

	@Override
	public ApiResponse<Customer> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Customer> crudReadTest(Customer res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Customer> crudUpdateTest(Customer oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Customer> crudDeleteTest(Customer res, ApiCaller caller) {
		return null;
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
