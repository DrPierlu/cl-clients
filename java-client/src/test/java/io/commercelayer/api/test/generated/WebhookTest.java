package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Webhook;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * WebhookTest
 */
public class WebhookTest extends IntegrationTest<Webhook> {

	@Override
	public ApiResponse<Webhook> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Webhook> crudReadTest(Webhook res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Webhook> crudUpdateTest(Webhook oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Webhook> crudDeleteTest(Webhook res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		WebhookTest test = new WebhookTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
