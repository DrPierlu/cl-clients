package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.MerchandisingRule;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * MerchandisingRuleTest
 */
public class MerchandisingRuleTest extends IntegrationTest<MerchandisingRule> {

	@Override
	public ApiResponse<MerchandisingRule> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<MerchandisingRule> testRead(MerchandisingRule res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<MerchandisingRule> testUpdate(MerchandisingRule oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<MerchandisingRule> testDelete(MerchandisingRule res, ApiCaller caller) {
		return null;
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
