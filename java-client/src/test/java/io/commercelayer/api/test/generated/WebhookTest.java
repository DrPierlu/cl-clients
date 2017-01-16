package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Webhook;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * WebhookTest
 */
public class WebhookTest extends IntegrationTest<Webhook> {

	@Override
	public ApiResponse<Webhook> testCreate(ApiCaller caller) {
		throw new TestException("WebhookTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Webhook> testRead(Webhook res, ApiCaller caller) {
		throw new TestException("WebhookTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Webhook> testUpdate(Webhook oldRes, ApiCaller caller) {
		throw new TestException("WebhookTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Webhook> testDelete(Webhook res, ApiCaller caller) {
		throw new TestException("WebhookTest.testDelete not implemented");
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
