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
	public ApiResponse<Webhook> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Webhook> testRead(Webhook res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Webhook> testUpdate(Webhook oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Webhook> testDelete(Webhook res, ApiCaller caller) {
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
