package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ConsumerRole;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ConsumerRoleTest
 */
public class ConsumerRoleTest extends IntegrationTest<ConsumerRole> {

	@Override
	public ApiResponse<ConsumerRole> testCreate(ApiCaller caller) {
		throw new TestException("ConsumerRoleTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<ConsumerRole> testRead(ConsumerRole res, ApiCaller caller) {
		throw new TestException("ConsumerRoleTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<ConsumerRole> testUpdate(ConsumerRole oldRes, ApiCaller caller) {
		throw new TestException("ConsumerRoleTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<ConsumerRole> testDelete(ConsumerRole res, ApiCaller caller) {
		throw new TestException("ConsumerRoleTest.testDelete not implemented");
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
