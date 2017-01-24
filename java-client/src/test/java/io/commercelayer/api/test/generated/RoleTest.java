package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Role;
import io.commercelayer.api.operation.DeleteAccountRolesId;
import io.commercelayer.api.operation.GetAccountRolesId;
import io.commercelayer.api.operation.PostAccountRoles;
import io.commercelayer.api.operation.PutAccountRolesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * RoleTest
 */
public class RoleTest extends IntegrationTest<Role> {

	@Override
	public ApiResponse<Role> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountRoles postOp = ApiOperations.PostAccountRoles();
	
		Role res = new Role();
	
		res.setName("name");
		// FIELD NOT FOUND -> res.setDescription("description");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountRoles> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Role> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getDescription());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Role> crudReadTest(Role res, ApiCaller caller) {
	
		// GET
	
		GetAccountRolesId getOp = ApiOperations.GetAccountRolesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountRolesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Role> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Role> crudUpdateTest(Role oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountRolesId putOp = ApiOperations.PutAccountRolesId();
		putOp.setId(oldRes.getId());
	
		Role res = new Role();
	
		res.setName(randomField(oldRes.getName()));
		// FIELD NOT FOUND -> res.setDescription(randomField(oldRes.getDescription()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountRolesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Role> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getDescription(), putRes.getResource().getDescription());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Role> crudDeleteTest(Role res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountRolesId delOp = ApiOperations.DeleteAccountRolesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountRolesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Role> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountRolesId getOp = ApiOperations.GetAccountRolesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountRolesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Role> getRes = null;
	
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
	
		RoleTest test = new RoleTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
