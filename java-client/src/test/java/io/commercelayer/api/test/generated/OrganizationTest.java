package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Organization;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * OrganizationTest
 */
public class OrganizationTest extends IntegrationTest<Organization> {

	@Override
	public ApiResponse<Organization> testCreate(ApiCaller caller) {
		throw new TestException("OrganizationTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Organization> testRead(Organization res, ApiCaller caller) {
		throw new TestException("OrganizationTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Organization> testUpdate(Organization oldRes, ApiCaller caller) {
		throw new TestException("OrganizationTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Organization> testDelete(Organization res, ApiCaller caller) {
		throw new TestException("OrganizationTest.testDelete not implemented");
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
