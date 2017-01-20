package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Organization;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * OrganizationTest
 */
public class OrganizationTest extends IntegrationTest<Organization> {

	@Override
	public ApiResponse<Organization> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Organization> crudReadTest(Organization res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Organization> crudUpdateTest(Organization oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Organization> crudDeleteTest(Organization res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		OrganizationTest test = new OrganizationTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
