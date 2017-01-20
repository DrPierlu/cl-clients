package io.commercelayer.api.test.integration;

import org.junit.Assert;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Customer;
import io.commercelayer.api.operation.DeleteAccountCustomersId;
import io.commercelayer.api.operation.GetAccountCustomersId;
import io.commercelayer.api.operation.PostAccountCustomers;
import io.commercelayer.api.operation.PutAccountCustomersId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * CustomerTest
 */
public class CustomerTest extends IntegrationTest<Customer> {

	@Override
	public ApiResponse<Customer> crudCreateTest(ApiCaller caller) {

		// POST

		PostAccountCustomers postOp = ApiOperations.PostAccountCustomers();

		Customer a = new Customer();

		a.setEmail("email");

		postOp.setPayload(a);

		ApiRequest<PostAccountCustomers> postReq = new ApiRequest<>(postOp);
		
		ApiResponse<Customer> postRes = test(postReq, caller);

		Assert.assertNotNull(postRes.getResource().getId());
		Assert.assertNotNull(postRes.getResource().getEmail());

		return postRes;

	}


	@Override
	public ApiResponse<Customer> crudReadTest(Customer res, ApiCaller caller) {

		// GET

		GetAccountCustomersId getOp = ApiOperations.GetAccountCustomersId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountCustomersId> getReq = new ApiRequest<>(getOp);

		ApiResponse<Customer> getRes = test(getReq, caller);

		Assert.assertNotNull(getRes.getResource().getEmail());

		return getRes;

	}


	@Override
	public ApiResponse<Customer> crudUpdateTest(Customer oldRes, ApiCaller caller) {

		// PUT

		PutAccountCustomersId putOp = ApiOperations.PutAccountCustomersId();
		putOp.setId(oldRes.getId());

		Customer a = new Customer();

		a.setEmail(randomField(a.getEmail()));

		putOp.setPayload(a);

		ApiRequest<PutAccountCustomersId> putReq = new ApiRequest<>(putOp);
		
		ApiResponse<Customer> putRes = test(putReq, caller);

		Assert.assertNotEquals(oldRes.getEmail(), putRes.getResource().getEmail());

		return putRes;

	}


	@Override
	public ApiResponse<Customer> crudDeleteTest(Customer res, ApiCaller caller) {

		// DELETE

		DeleteAccountCustomersId delOp = ApiOperations.DeleteAccountCustomersId();
		delOp.setId(res.getId());

		ApiRequest<DeleteAccountCustomersId> delReq = new ApiRequest<>(delOp);

		ApiResponse<Customer> delRes = test(delReq, caller);

		// GET

		GetAccountCustomersId getOp = ApiOperations.GetAccountCustomersId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountCustomersId> getReq = new ApiRequest<>(getOp);

		ApiResponse<Customer> getRes = test(getReq, caller, false);

		Assert.assertNull(getRes.getResource());

		return delRes;

	}


	public static void main(String[] args) {

		CustomerTest test = new CustomerTest();

		test.runTest();

		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();

	}

}
