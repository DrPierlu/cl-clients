package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Merchant;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * MerchantTest
 */
public class MerchantTest extends IntegrationTest<Merchant> {

	@Override
	public ApiResponse<Merchant> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Merchant> testRead(Merchant res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Merchant> testUpdate(Merchant oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Merchant> testDelete(Merchant res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		MerchantTest test = new MerchantTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}