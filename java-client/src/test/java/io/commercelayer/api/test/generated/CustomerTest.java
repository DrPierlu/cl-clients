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
	public ApiResponse<Customer> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Customer> testRead(Customer res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Customer> testUpdate(Customer oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Customer> testDelete(Customer res, ApiCaller caller) {
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
