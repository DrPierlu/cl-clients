package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.User;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * UserTest
 */
public class UserTest extends IntegrationTest<User> {

	@Override
	public ApiResponse<User> testCreate(ApiCaller caller) {
		throw new TestException("UserTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<User> testRead(User res, ApiCaller caller) {
		throw new TestException("UserTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<User> testUpdate(User oldRes, ApiCaller caller) {
		throw new TestException("UserTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<User> testDelete(User res, ApiCaller caller) {
		throw new TestException("UserTest.testDelete not implemented");
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
