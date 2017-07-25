package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PaypalAccount;
import io.commercelayer.api.operation.DeleteAccountPaypalAccountsId;
import io.commercelayer.api.operation.GetAccountPaypalAccountsId;
import io.commercelayer.api.operation.PostCallbacksPaypalAccountsToken;
import io.commercelayer.api.operation.PutAccountPaypalAccountsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * PaypalAccountTest
 */
public class PaypalAccountTest extends IntegrationTest<PaypalAccount> {

	@Override
	public ApiResponse<PaypalAccount> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostCallbacksPaypalAccountsToken postOp = ApiOperations.PostCallbacksPaypalAccountsToken();
	
		PaypalAccount res = new PaypalAccount();
	
	
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostCallbacksPaypalAccountsToken> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<PaypalAccount> postRes = test(postReq, caller);
	
	
	
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<PaypalAccount> crudReadTest(PaypalAccount res, ApiCaller caller) {
	
		// GET
	
		GetAccountPaypalAccountsId getOp = ApiOperations.GetAccountPaypalAccountsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountPaypalAccountsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<PaypalAccount> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<PaypalAccount> crudUpdateTest(PaypalAccount oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountPaypalAccountsId putOp = ApiOperations.PutAccountPaypalAccountsId();
		putOp.setId(oldRes.getId());
	
		PaypalAccount res = new PaypalAccount();
	
	
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountPaypalAccountsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<PaypalAccount> putRes = test(putReq, caller);
	
	
	
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<PaypalAccount> crudDeleteTest(PaypalAccount res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountPaypalAccountsId delOp = ApiOperations.DeleteAccountPaypalAccountsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountPaypalAccountsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<PaypalAccount> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountPaypalAccountsId getOp = ApiOperations.GetAccountPaypalAccountsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountPaypalAccountsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<PaypalAccount> getRes = null;
	
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
	
		PaypalAccountTest test = new PaypalAccountTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
