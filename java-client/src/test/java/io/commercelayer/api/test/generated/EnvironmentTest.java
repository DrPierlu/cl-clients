package io.commercelayer.api.test.generated;

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
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * EnvironmentTest
 */
public class EnvironmentTest extends IntegrationTest<Environment> {

	@Override
	public ApiResponse<Environment> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountEnvironments postOp = ApiOperations.PostAccountEnvironments();
	
		Environment res = new Environment();
	
		// FIELD NOT FOUND -> res.setOrganizationId("organizationId");
		res.setName("name");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountEnvironments> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Environment> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getOrganizationId());
		Assert.assertNotNull(postRes.getResource().getName());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Environment> crudReadTest(Environment res, ApiCaller caller) {
	
		// GET
	
		GetAccountEnvironmentsId getOp = ApiOperations.GetAccountEnvironmentsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountEnvironmentsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Environment> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Environment> crudUpdateTest(Environment oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountEnvironmentsId putOp = ApiOperations.PutAccountEnvironmentsId();
		putOp.setId(oldRes.getId());
	
		Environment res = new Environment();
	
		// FIELD NOT FOUND -> res.setOrganizationId(randomField(oldRes.getOrganizationId()));
		res.setName(randomField(oldRes.getName()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountEnvironmentsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Environment> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getOrganizationId(), putRes.getResource().getOrganizationId());
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
	
	
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
	
		ApiResponse<Environment> getRes = null;
	
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
	
		EnvironmentTest test = new EnvironmentTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
