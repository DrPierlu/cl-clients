package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.User;
import io.commercelayer.api.operation.DeleteAccountUsersId;
import io.commercelayer.api.operation.GetAccountUsersId;
import io.commercelayer.api.operation.PostAccountUsers;
import io.commercelayer.api.operation.PutAccountUsersId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * UserTest
 */
public class UserTest extends IntegrationTest<User> {

	@Override
	public ApiResponse<User> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountUsers postOp = ApiOperations.PostAccountUsers();
	
		User res = new User();
	
		// FIELD NOT FOUND -> res.setFirstName("firstName");
		// FIELD NOT FOUND -> res.setLastName("lastName");
		// FIELD NOT FOUND -> res.setPasswordConfirmation("passwordConfirmation");
		// FIELD NOT FOUND -> res.setPassword("password");
		res.setEmail("email");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountUsers> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<User> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getFirstName());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getLastName());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPasswordConfirmation());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPassword());
		Assert.assertNotNull(postRes.getResource().getEmail());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<User> crudReadTest(User res, ApiCaller caller) {
	
		// GET
	
		GetAccountUsersId getOp = ApiOperations.GetAccountUsersId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountUsersId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<User> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<User> crudUpdateTest(User oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountUsersId putOp = ApiOperations.PutAccountUsersId();
		putOp.setId(oldRes.getId());
	
		User res = new User();
	
		// FIELD NOT FOUND -> res.setFirstName(randomField(oldRes.getFirstName()));
		// FIELD NOT FOUND -> res.setLastName(randomField(oldRes.getLastName()));
		// FIELD NOT FOUND -> res.setPasswordConfirmation(randomField(oldRes.getPasswordConfirmation()));
		// FIELD NOT FOUND -> res.setPassword(randomField(oldRes.getPassword()));
		res.setEmail(randomField(oldRes.getEmail()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountUsersId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<User> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getFirstName(), putRes.getResource().getFirstName());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getLastName(), putRes.getResource().getLastName());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPasswordConfirmation(), putRes.getResource().getPasswordConfirmation());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPassword(), putRes.getResource().getPassword());
		Assert.assertNotEquals(oldRes.getEmail(), putRes.getResource().getEmail());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<User> crudDeleteTest(User res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountUsersId delOp = ApiOperations.DeleteAccountUsersId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountUsersId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<User> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountUsersId getOp = ApiOperations.GetAccountUsersId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountUsersId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<User> getRes = null;
	
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
	
		UserTest test = new UserTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
