package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Webhook;
import io.commercelayer.api.operation.DeleteAccountWebhooksId;
import io.commercelayer.api.operation.GetAccountWebhooksId;
import io.commercelayer.api.operation.PostAccountWebhooks;
import io.commercelayer.api.operation.PutAccountWebhooksId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * WebhookTest
 */
public class WebhookTest extends IntegrationTest<Webhook> {

	@Override
	public ApiResponse<Webhook> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountWebhooks postOp = ApiOperations.PostAccountWebhooks();
	
		Webhook res = new Webhook();
	
		// FIELD NOT FOUND -> res.setEventUrl("eventUrl");
		// FIELD NOT FOUND -> res.setEventAction("eventAction");
		// FIELD NOT FOUND -> res.setEventSubject("eventSubject");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountWebhooks> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Webhook> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getEventUrl());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getEventAction());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getEventSubject());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Webhook> crudReadTest(Webhook res, ApiCaller caller) {
	
		// GET
	
		GetAccountWebhooksId getOp = ApiOperations.GetAccountWebhooksId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountWebhooksId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Webhook> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Webhook> crudUpdateTest(Webhook oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountWebhooksId putOp = ApiOperations.PutAccountWebhooksId();
		putOp.setId(oldRes.getId());
	
		Webhook res = new Webhook();
	
		// FIELD NOT FOUND -> res.setEventUrl(randomField(oldRes.getEventUrl()));
		// FIELD NOT FOUND -> res.setEventAction(randomField(oldRes.getEventAction()));
		// FIELD NOT FOUND -> res.setEventSubject(randomField(oldRes.getEventSubject()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountWebhooksId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Webhook> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getEventUrl(), putRes.getResource().getEventUrl());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getEventAction(), putRes.getResource().getEventAction());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getEventSubject(), putRes.getResource().getEventSubject());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Webhook> crudDeleteTest(Webhook res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountWebhooksId delOp = ApiOperations.DeleteAccountWebhooksId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountWebhooksId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Webhook> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountWebhooksId getOp = ApiOperations.GetAccountWebhooksId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountWebhooksId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Webhook> getRes = null;
	
		try {
			getRes = test(getReq, caller, false);
		}
		catch (TestException te) {
			if (te.causedByApiError()) {
				Assert.assertTrue(te.getError().getHttpErrorCode() == 404);
				Assert.assertNull(getRes);
			}
			else throw te;
		}
	
	
		return delRes;
	
	}
	

	public static void main(String[] args) {
	
		WebhookTest test = new WebhookTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
