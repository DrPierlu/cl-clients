package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Permission;
import io.commercelayer.api.operation.DeleteAccountPermissionsId;
import io.commercelayer.api.operation.GetAccountPermissionsId;
import io.commercelayer.api.operation.PostAccountPermissions;
import io.commercelayer.api.operation.PutAccountPermissionsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * PermissionTest
 */
public class PermissionTest extends IntegrationTest<Permission> {

	@Override
	public ApiResponse<Permission> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountPermissions postOp = ApiOperations.PostAccountPermissions();
	
		Permission res = new Permission();
	
		res.setResource("resource");
		// FIELD NOT FOUND -> res.setRoleId("roleId");
		res.setAction("action");
		// FIELD NOT FOUND -> res.setRestrictions("restrictions");
		res.setAbility("ability");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountPermissions> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Permission> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getResource());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getRoleId());
		Assert.assertNotNull(postRes.getResource().getAction());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getRestrictions());
		Assert.assertNotNull(postRes.getResource().getAbility());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Permission> crudReadTest(Permission res, ApiCaller caller) {
	
		// GET
	
		GetAccountPermissionsId getOp = ApiOperations.GetAccountPermissionsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountPermissionsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Permission> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Permission> crudUpdateTest(Permission oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountPermissionsId putOp = ApiOperations.PutAccountPermissionsId();
		putOp.setId(oldRes.getId());
	
		Permission res = new Permission();
	
		res.setResource(randomField(oldRes.getResource()));
		// FIELD NOT FOUND -> res.setRoleId(randomField(oldRes.getRoleId()));
		res.setAction(randomField(oldRes.getAction()));
		// FIELD NOT FOUND -> res.setRestrictions(randomField(oldRes.getRestrictions()));
		res.setAbility(randomField(oldRes.getAbility()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountPermissionsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Permission> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getResource(), putRes.getResource().getResource());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getRoleId(), putRes.getResource().getRoleId());
		Assert.assertNotEquals(oldRes.getAction(), putRes.getResource().getAction());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getRestrictions(), putRes.getResource().getRestrictions());
		Assert.assertNotEquals(oldRes.getAbility(), putRes.getResource().getAbility());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Permission> crudDeleteTest(Permission res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountPermissionsId delOp = ApiOperations.DeleteAccountPermissionsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountPermissionsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Permission> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountPermissionsId getOp = ApiOperations.GetAccountPermissionsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountPermissionsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Permission> getRes = null;
	
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
	
		PermissionTest test = new PermissionTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
