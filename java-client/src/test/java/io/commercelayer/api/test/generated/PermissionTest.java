package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Permission;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * PermissionTest
 */
public class PermissionTest extends IntegrationTest<Permission> {

	@Override
	public ApiResponse<Permission> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Permission> testRead(Permission res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Permission> testUpdate(Permission oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Permission> testDelete(Permission res, ApiCaller caller) {
		return null;
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
