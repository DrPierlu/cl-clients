package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.MerchandisingRule;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * MerchandisingRuleTest
 */
public class MerchandisingRuleTest extends IntegrationTest<MerchandisingRule> {

	@Override
	public ApiResponse<MerchandisingRule> testCreate(ApiCaller caller) {
		throw new TestException("MerchandisingRuleTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<MerchandisingRule> testRead(MerchandisingRule res, ApiCaller caller) {
		throw new TestException("MerchandisingRuleTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<MerchandisingRule> testUpdate(MerchandisingRule oldRes, ApiCaller caller) {
		throw new TestException("MerchandisingRuleTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<MerchandisingRule> testDelete(MerchandisingRule res, ApiCaller caller) {
		throw new TestException("MerchandisingRuleTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		MerchandisingRuleTest test = new MerchandisingRuleTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
