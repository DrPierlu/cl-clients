package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ConsumerRole;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ConsumerRoleTest
 */
public class ConsumerRoleTest extends IntegrationTest<ConsumerRole> {

	@Override
	public ApiResponse<ConsumerRole> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ConsumerRole> crudReadTest(ConsumerRole res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ConsumerRole> crudUpdateTest(ConsumerRole oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ConsumerRole> crudDeleteTest(ConsumerRole res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ConsumerRoleTest test = new ConsumerRoleTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
