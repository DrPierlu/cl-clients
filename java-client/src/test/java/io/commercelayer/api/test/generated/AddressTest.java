package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Address;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * AddressTest
 */
public class AddressTest extends IntegrationTest<Address> {

	@Override
	public ApiResponse<Address> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Address> testRead(Address res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Address> testUpdate(Address oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Address> testDelete(Address res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		AddressTest test = new AddressTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
