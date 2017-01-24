package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.State;
import io.commercelayer.api.operation.DeleteAccountStatesId;
import io.commercelayer.api.operation.GetAccountStatesId;
import io.commercelayer.api.operation.PostAccountStates;
import io.commercelayer.api.operation.PutAccountStatesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * StateTest
 */
public class StateTest extends IntegrationTest<State> {

	@Override
	public ApiResponse<State> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountStates postOp = ApiOperations.PostAccountStates();
	
		State res = new State();
	
		res.setCode("code");
		// FIELD NOT FOUND -> res.setCountryId("countryId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountStates> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<State> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getCode());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCountryId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<State> crudReadTest(State res, ApiCaller caller) {
	
		// GET
	
		GetAccountStatesId getOp = ApiOperations.GetAccountStatesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountStatesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<State> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<State> crudUpdateTest(State oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountStatesId putOp = ApiOperations.PutAccountStatesId();
		putOp.setId(oldRes.getId());
	
		State res = new State();
	
		res.setCode(randomField(oldRes.getCode()));
		// FIELD NOT FOUND -> res.setCountryId(randomField(oldRes.getCountryId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountStatesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<State> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getCode(), putRes.getResource().getCode());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCountryId(), putRes.getResource().getCountryId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<State> crudDeleteTest(State res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountStatesId delOp = ApiOperations.DeleteAccountStatesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountStatesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<State> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountStatesId getOp = ApiOperations.GetAccountStatesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountStatesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<State> getRes = null;
	
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
	
		StateTest test = new StateTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
