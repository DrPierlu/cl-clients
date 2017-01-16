package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Permission;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * PermissionTest
 */
public class PermissionTest extends IntegrationTest<Permission> {

	@Override
	public ApiResponse<Permission> testCreate(ApiCaller caller) {
		throw new TestException("PermissionTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Permission> testRead(Permission res, ApiCaller caller) {
		throw new TestException("PermissionTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Permission> testUpdate(Permission oldRes, ApiCaller caller) {
		throw new TestException("PermissionTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Permission> testDelete(Permission res, ApiCaller caller) {
		throw new TestException("PermissionTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		PermissionTest test = new PermissionTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
