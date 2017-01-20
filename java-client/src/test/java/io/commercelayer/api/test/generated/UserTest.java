package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.User;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * UserTest
 */
public class UserTest extends IntegrationTest<User> {

	@Override
	public ApiResponse<User> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<User> crudReadTest(User res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<User> crudUpdateTest(User oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<User> crudDeleteTest(User res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		UserTest test = new UserTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
