package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Organization;
import io.commercelayer.api.operation.DeleteAccountOrganizationsId;
import io.commercelayer.api.operation.GetAccountOrganizationsId;
import io.commercelayer.api.operation.PostAccountOrganizations;
import io.commercelayer.api.operation.PutAccountOrganizationsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * OrganizationTest
 */
public class OrganizationTest extends IntegrationTest<Organization> {

	@Override
	public ApiResponse<Organization> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountOrganizations postOp = ApiOperations.PostAccountOrganizations();
	
		Organization res = new Organization();
	
		res.setName("name");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountOrganizations> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Organization> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getName());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Organization> crudReadTest(Organization res, ApiCaller caller) {
	
		// GET
	
		GetAccountOrganizationsId getOp = ApiOperations.GetAccountOrganizationsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountOrganizationsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Organization> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Organization> crudUpdateTest(Organization oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountOrganizationsId putOp = ApiOperations.PutAccountOrganizationsId();
		putOp.setId(oldRes.getId());
	
		Organization res = new Organization();
	
		res.setName(randomField(oldRes.getName()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountOrganizationsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Organization> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Organization> crudDeleteTest(Organization res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountOrganizationsId delOp = ApiOperations.DeleteAccountOrganizationsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountOrganizationsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Organization> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountOrganizationsId getOp = ApiOperations.GetAccountOrganizationsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountOrganizationsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Organization> getRes = null;
	
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
	
		OrganizationTest test = new OrganizationTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
