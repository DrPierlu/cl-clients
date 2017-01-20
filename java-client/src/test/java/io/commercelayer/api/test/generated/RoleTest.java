package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Role;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * RoleTest
 */
public class RoleTest extends IntegrationTest<Role> {

	@Override
	public ApiResponse<Role> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Role> crudReadTest(Role res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Role> crudUpdateTest(Role oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Role> crudDeleteTest(Role res, ApiCaller caller) {
		return null;
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
