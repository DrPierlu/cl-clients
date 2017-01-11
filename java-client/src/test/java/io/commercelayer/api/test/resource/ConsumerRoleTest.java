package io.commercelayer.api.test.resource;

import org.junit.Assert;

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

/**
 * ConsumerRoleTest
 */
public class ConsumerRoleTest extends IntegrationTest<ConsumerRole> {

	@Override
	public ApiResponse<ConsumerRole> testCreate(ApiCaller caller) {

		// POST

		PostAccountConsumerRoles postOp = ApiOperations.PostAccountConsumerRoles();

		ConsumerRole a = new ConsumerRole();

		a.setConsumerId(randomValue());
		a.setRoleId(randomValue());
		a.setConsumerResource(randomField("ConsumerResource"));

		postOp.setPayload(a);

		ApiRequest<PostAccountConsumerRoles> postReq = new ApiRequest<>(postOp);
		ApiResponse<ConsumerRole> postRes = test(postReq, ConsumerRole.class, caller);

		Assert.assertNotNull(postRes.getResource().getId());
		Assert.assertNotNull(postRes.getResource().getConsumerId());
		Assert.assertEquals(a.getConsumerResource(), postRes.getResource().getConsumerResource());

		return postRes;

	}


	@Override
	public ApiResponse<ConsumerRole> testRead(ConsumerRole res, ApiCaller caller) {

		// GET

		GetAccountConsumerRolesId getOp = ApiOperations.GetAccountConsumerRolesId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountConsumerRolesId> getReq = new ApiRequest<>(getOp);

		ApiResponse<ConsumerRole> getRes = test(getReq, ConsumerRole.class, caller);

		Assert.assertNotNull(getRes.getResource().getRoleId());

		return getRes;

	}


	@Override
	public ApiResponse<ConsumerRole> testUpdate(ConsumerRole oldRes, ApiCaller caller) {

		// PUT

		PutAccountConsumerRolesId putOp = ApiOperations.PutAccountConsumerRolesId();
		putOp.setId(oldRes.getId());

		ConsumerRole a = new ConsumerRole();

		a.setConsumerId(randomValue());
		a.setRoleId(randomValue());
		a.setConsumerResource(randomField(oldRes.getConsumerResource()));

		putOp.setPayload(a);

		ApiRequest<PutAccountConsumerRolesId> putReq = new ApiRequest<>(putOp);
		ApiResponse<ConsumerRole> putRes = test(putReq, ConsumerRole.class, caller);

		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());

		return putRes;

	}


	@Override
	public ApiResponse<ConsumerRole> testDelete(ConsumerRole res, ApiCaller caller) {

		// DELETE

		DeleteAccountConsumerRolesId delOp = ApiOperations.DeleteAccountConsumerRolesId();
		delOp.setId(res.getId());

		ApiRequest<DeleteAccountConsumerRolesId> delReq = new ApiRequest<>(delOp);

		ApiResponse<ConsumerRole> delRes = test(delReq, caller);

		// GET

		GetAccountConsumerRolesId getOp = ApiOperations.GetAccountConsumerRolesId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountConsumerRolesId> getReq = new ApiRequest<>(getOp);

		ApiResponse<ConsumerRole> getRes = test(getReq, ConsumerRole.class, caller, false);

		Assert.assertNull(getRes.getResource());

		return delRes;

	}


	public static void main(String[] args) {

		ConsumerRoleTest test = new ConsumerRoleTest();

		test.runTest();

		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();

	}

}
