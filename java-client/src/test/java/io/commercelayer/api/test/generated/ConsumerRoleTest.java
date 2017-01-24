package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ConsumerRole;
import io.commercelayer.api.operation.DeleteAccountConsumerRolesId;
import io.commercelayer.api.operation.GetAccountConsumerRolesId;
import io.commercelayer.api.operation.PostAccountConsumerRoles;
import io.commercelayer.api.operation.PutAccountConsumerRolesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ConsumerRoleTest
 */
public class ConsumerRoleTest extends IntegrationTest<ConsumerRole> {

	@Override
	public ApiResponse<ConsumerRole> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountConsumerRoles postOp = ApiOperations.PostAccountConsumerRoles();
	
		ConsumerRole res = new ConsumerRole();
	
		// FIELD NOT FOUND -> res.setConsumerId("consumerId");
		// FIELD NOT FOUND -> res.setRoleId("roleId");
		// FIELD NOT FOUND -> res.setConsumerResource("consumerResource");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountConsumerRoles> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ConsumerRole> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getConsumerId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getRoleId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getConsumerResource());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ConsumerRole> crudReadTest(ConsumerRole res, ApiCaller caller) {
	
		// GET
	
		GetAccountConsumerRolesId getOp = ApiOperations.GetAccountConsumerRolesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountConsumerRolesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ConsumerRole> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ConsumerRole> crudUpdateTest(ConsumerRole oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountConsumerRolesId putOp = ApiOperations.PutAccountConsumerRolesId();
		putOp.setId(oldRes.getId());
	
		ConsumerRole res = new ConsumerRole();
	
		// FIELD NOT FOUND -> res.setConsumerId(randomField(oldRes.getConsumerId()));
		// FIELD NOT FOUND -> res.setRoleId(randomField(oldRes.getRoleId()));
		// FIELD NOT FOUND -> res.setConsumerResource(randomField(oldRes.getConsumerResource()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountConsumerRolesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ConsumerRole> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getConsumerId(), putRes.getResource().getConsumerId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getRoleId(), putRes.getResource().getRoleId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getConsumerResource(), putRes.getResource().getConsumerResource());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ConsumerRole> crudDeleteTest(ConsumerRole res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountConsumerRolesId delOp = ApiOperations.DeleteAccountConsumerRolesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountConsumerRolesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ConsumerRole> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountConsumerRolesId getOp = ApiOperations.GetAccountConsumerRolesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountConsumerRolesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ConsumerRole> getRes = null;
	
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
	
		ConsumerRoleTest test = new ConsumerRoleTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
