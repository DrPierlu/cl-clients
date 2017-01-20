package io.commercelayer.api.test.integration;

import org.junit.Assert;

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

/**
 * GatewayTest
 */
public class GatewayTest extends IntegrationTest<Gateway> {

	@Override
	public ApiResponse<Gateway> crudCreateTest(ApiCaller caller) {

		// POST

		PostAccountGateways postOp = ApiOperations.PostAccountGateways();

		Gateway a = new Gateway();

		a.setKind("kind");

		postOp.setPayload(a);

		ApiRequest<PostAccountGateways> postReq = new ApiRequest<>(postOp);
		
		ApiResponse<Gateway> postRes = test(postReq, caller);

		Assert.assertNotNull(postRes.getResource().getId());
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

		Assert.assertNotNull(getRes.getResource().getName());
		Assert.assertNotNull(getRes.getResource().getKind());

		return getRes;

	}


	@Override
	public ApiResponse<Gateway> crudUpdateTest(Gateway oldRes, ApiCaller caller) {

		// PUT

		PutAccountGatewaysId putOp = ApiOperations.PutAccountGatewaysId();
		putOp.setId(oldRes.getId());

		Gateway a = new Gateway();

		a.setKind(randomField(oldRes.getKind()));

		putOp.setPayload(a);

		ApiRequest<PutAccountGatewaysId> putReq = new ApiRequest<>(putOp);
		
		ApiResponse<Gateway> putRes = test(putReq, caller);

		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
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

		ApiResponse<Gateway> getRes = test(getReq, caller, false);

		Assert.assertNull(getRes.getResource());

		return delRes;

	}


	public static void main(String[] args) {

		GatewayTest test = new GatewayTest();

		test.runTest();

		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();

	}

}
