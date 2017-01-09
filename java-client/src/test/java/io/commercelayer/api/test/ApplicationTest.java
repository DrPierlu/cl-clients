package io.commercelayer.api.test;

import org.junit.Assert;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Application;
import io.commercelayer.api.operation.GetAccountApplicationsId;
import io.commercelayer.api.operation.PostAccountApplications;
import io.commercelayer.api.operation.PutAccountApplicationsId;
import io.commercelayer.api.operation.common.DeleteOperation;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * ApplicationTest
 */
public class ApplicationTest extends IntegrationTest<Application> {

	@Override
	public ApiResponse<Application> testCreate(ApiCaller caller) {

		// POST

		PostAccountApplications postOp = ApiOperations.PostAccountApplications();

		Application a = new Application();

		a.setName("Application_1");

		postOp.setPayload(a);

		ApiRequest<PostAccountApplications> postReq = new ApiRequest<>(postOp);
		ApiResponse<Application> postRes = test(postReq, Application.class, caller);

		Assert.assertNotNull(postRes.getResource().getId());

		return postRes;

	}


	@Override
	public ApiResponse<Application> testRead(Application res, ApiCaller caller) {

		// GET

		GetAccountApplicationsId getOp = ApiOperations.GetAccountApplicationsId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountApplicationsId> getReq = new ApiRequest<>(getOp);

		ApiResponse<Application> getRes = test(getReq, Application.class, caller);

		Assert.assertNotNull(getRes.getResource().getName());

		return getRes;

	}


	@Override
	public ApiResponse<Application> testUpdate(Application oldRes, ApiCaller caller) {

		// PUT

		PutAccountApplicationsId putOp = ApiOperations.PutAccountApplicationsId();
		putOp.setId(oldRes.getId());

		Application a = new Application();

		a.setName("Application_1.2");

		putOp.setPayload(a);

		ApiRequest<PutAccountApplicationsId> putReq = new ApiRequest<>(putOp);
		ApiResponse<Application> putRes = test(putReq, Application.class, caller);

		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());

		return putRes;

	}


	@Override
	public ApiResponse<Application> testDelete(Application res, ApiCaller caller) {

		// DELETE

		DeleteOperation delOp = ApiOperations.DeleteAccountAddressesId();
		delOp.setId(res.getId());

		ApiRequest<DeleteOperation> delReq = new ApiRequest<>(delOp);

		ApiResponse<Application> delRes = test(delReq, caller);

		// GET

		GetAccountApplicationsId getOp = ApiOperations.GetAccountApplicationsId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountApplicationsId> getReq = new ApiRequest<>(getOp);

		ApiResponse<Application> getRes = test(getReq, Application.class, caller, false);

		Assert.assertNull(getRes.getResource());
		Assert.assertNotNull(getRes.getApiError());

		return delRes;

	}


	public static void main(String[] args) {

		ApplicationTest test = new ApplicationTest();

		test.runTest();

		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();

	}

}
