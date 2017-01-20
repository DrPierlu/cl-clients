package io.commercelayer.api.test.integration;

import org.junit.Assert;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Environment;
import io.commercelayer.api.operation.DeleteAccountEnvironmentsId;
import io.commercelayer.api.operation.GetAccountEnvironmentsId;
import io.commercelayer.api.operation.PostAccountEnvironments;
import io.commercelayer.api.operation.PutAccountEnvironmentsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * EnvironmentTest
 */
public class EnvironmentTest extends IntegrationTest<Environment> {

	@Override
	public ApiResponse<Environment> crudCreateTest(ApiCaller caller) {

		// POST

		PostAccountEnvironments postOp = ApiOperations.PostAccountEnvironments();

		Environment a = new Environment();

		a.setName("environment");
		a.setOrganizationId(randomValue());

		postOp.setPayload(a);

		ApiRequest<PostAccountEnvironments> postReq = new ApiRequest<>(postOp);
		
		ApiResponse<Environment> postRes = test(postReq, caller);

		Assert.assertNotNull(postRes.getResource().getId());
		Assert.assertNotNull(postRes.getResource().getName());
		Assert.assertNotNull(postRes.getResource().getOrganizationId());

		return postRes;

	}


	@Override
	public ApiResponse<Environment> crudReadTest(Environment res, ApiCaller caller) {

		// GET

		GetAccountEnvironmentsId getOp = ApiOperations.GetAccountEnvironmentsId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountEnvironmentsId> getReq = new ApiRequest<>(getOp);

		ApiResponse<Environment> getRes = test(getReq, caller);

		Assert.assertNotNull(getRes.getResource().getName());
		Assert.assertNotNull(getRes.getResource().getOrganizationId());

		return getRes;

	}


	@Override
	public ApiResponse<Environment> crudUpdateTest(Environment oldRes, ApiCaller caller) {

		// PUT

		PutAccountEnvironmentsId putOp = ApiOperations.PutAccountEnvironmentsId();
		putOp.setId(oldRes.getId());

		Environment a = new Environment();

		a.setName(randomField(oldRes.getName()));
		a.setOrganizationId(randomValue());

		putOp.setPayload(a);

		ApiRequest<PutAccountEnvironmentsId> putReq = new ApiRequest<>(putOp);
		
		ApiResponse<Environment> putRes = test(putReq, caller);

		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		Assert.assertNotEquals(oldRes.getOrganizationId(), putRes.getResource().getOrganizationId());

		return putRes;

	}


	@Override
	public ApiResponse<Environment> crudDeleteTest(Environment res, ApiCaller caller) {

		// DELETE

		DeleteAccountEnvironmentsId delOp = ApiOperations.DeleteAccountEnvironmentsId();
		delOp.setId(res.getId());

		ApiRequest<DeleteAccountEnvironmentsId> delReq = new ApiRequest<>(delOp);

		ApiResponse<Environment> delRes = test(delReq, caller);

		// GET

		GetAccountEnvironmentsId getOp = ApiOperations.GetAccountEnvironmentsId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountEnvironmentsId> getReq = new ApiRequest<>(getOp);

		ApiResponse<Environment> getRes = test(getReq, caller, false);

		Assert.assertNull(getRes.getResource());

		return delRes;

	}


	public static void main(String[] args) {

		EnvironmentTest test = new EnvironmentTest();

		test.runTest();

		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();

	}

}
