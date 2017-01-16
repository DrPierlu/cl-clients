package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Role;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * RoleTest
 */
public class RoleTest extends IntegrationTest<Role> {

	@Override
	public ApiResponse<Role> testCreate(ApiCaller caller) {
		throw new TestException("RoleTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Role> testRead(Role res, ApiCaller caller) {
		throw new TestException("RoleTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Role> testUpdate(Role oldRes, ApiCaller caller) {
		throw new TestException("RoleTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Role> testDelete(Role res, ApiCaller caller) {
		throw new TestException("RoleTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		RoleTest test = new RoleTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
