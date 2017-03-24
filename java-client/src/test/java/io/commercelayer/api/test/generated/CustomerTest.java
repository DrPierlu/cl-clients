package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Customer;
import io.commercelayer.api.operation.DeleteAccountCustomersId;
import io.commercelayer.api.operation.GetAccountCustomersId;
import io.commercelayer.api.operation.PostChannelCustomers;
import io.commercelayer.api.operation.PutAccountCustomersId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * CustomerTest
 */
public class CustomerTest extends IntegrationTest<Customer> {

	@Override
	public ApiResponse<Customer> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostChannelCustomers postOp = ApiOperations.PostChannelCustomers();
	
		Customer res = new Customer();
	
		// FIELD NOT FOUND -> res.setPasswordConfirmation("passwordConfirmation");
		// FIELD NOT FOUND -> res.setPassword("password");
		res.setEmail("email");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostChannelCustomers> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Customer> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPasswordConfirmation());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPassword());
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
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Customer> crudUpdateTest(Customer oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountCustomersId putOp = ApiOperations.PutAccountCustomersId();
		putOp.setId(oldRes.getId());
	
		Customer res = new Customer();
	
		// FIELD NOT FOUND -> res.setPasswordConfirmation(randomField(oldRes.getPasswordConfirmation()));
		// FIELD NOT FOUND -> res.setPassword(randomField(oldRes.getPassword()));
		res.setEmail(randomField(oldRes.getEmail()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountCustomersId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Customer> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPasswordConfirmation(), putRes.getResource().getPasswordConfirmation());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPassword(), putRes.getResource().getPassword());
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
	
		ApiResponse<Customer> getRes = null;
	
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
	
		CustomerTest test = new CustomerTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
