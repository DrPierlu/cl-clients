package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Gateway;
import io.commercelayer.api.operation.DeleteAccountGatewaysId;
import io.commercelayer.api.operation.GetAccountGatewaysId;
import io.commercelayer.api.operation.PostAccountGateways;
import io.commercelayer.api.operation.PutAccountGatewaysId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * GatewayTest
 */
public class GatewayTest extends IntegrationTest<Gateway> {

	@Override
	public ApiResponse<Gateway> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountGateways postOp = ApiOperations.PostAccountGateways();
	
		Gateway res = new Gateway();
	
		res.setKind("kind");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountGateways> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Gateway> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getKind());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Gateway> crudReadTest(Gateway res, ApiCaller caller) {
	
		// GET
	
		GetAccountGatewaysId getOp = ApiOperations.GetAccountGatewaysId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountGatewaysId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Gateway> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Gateway> crudUpdateTest(Gateway oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountGatewaysId putOp = ApiOperations.PutAccountGatewaysId();
		putOp.setId(oldRes.getId());
	
		Gateway res = new Gateway();
	
		res.setKind(randomField(oldRes.getKind()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountGatewaysId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Gateway> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getKind(), putRes.getResource().getKind());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Gateway> crudDeleteTest(Gateway res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountGatewaysId delOp = ApiOperations.DeleteAccountGatewaysId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountGatewaysId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Gateway> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountGatewaysId getOp = ApiOperations.GetAccountGatewaysId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountGatewaysId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Gateway> getRes = null;
	
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
	
		GatewayTest test = new GatewayTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
