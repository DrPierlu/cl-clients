package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.CountryGroup;
import io.commercelayer.api.operation.DeleteAccountCountryGroupsId;
import io.commercelayer.api.operation.GetAccountCountryGroupsId;
import io.commercelayer.api.operation.PostAccountCountryGroups;
import io.commercelayer.api.operation.PutAccountCountryGroupsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * CountryGroupTest
 */
public class CountryGroupTest extends IntegrationTest<CountryGroup> {

	@Override
	public ApiResponse<CountryGroup> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountCountryGroups postOp = ApiOperations.PostAccountCountryGroups();
	
		CountryGroup res = new CountryGroup();
	
		res.setName("name");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountCountryGroups> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<CountryGroup> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getName());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<CountryGroup> crudReadTest(CountryGroup res, ApiCaller caller) {
	
		// GET
	
		GetAccountCountryGroupsId getOp = ApiOperations.GetAccountCountryGroupsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountCountryGroupsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<CountryGroup> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<CountryGroup> crudUpdateTest(CountryGroup oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountCountryGroupsId putOp = ApiOperations.PutAccountCountryGroupsId();
		putOp.setId(oldRes.getId());
	
		CountryGroup res = new CountryGroup();
	
		res.setName(randomField(oldRes.getName()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountCountryGroupsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<CountryGroup> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<CountryGroup> crudDeleteTest(CountryGroup res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountCountryGroupsId delOp = ApiOperations.DeleteAccountCountryGroupsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountCountryGroupsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<CountryGroup> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountCountryGroupsId getOp = ApiOperations.GetAccountCountryGroupsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountCountryGroupsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<CountryGroup> getRes = null;
	
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
	
		CountryGroupTest test = new CountryGroupTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
