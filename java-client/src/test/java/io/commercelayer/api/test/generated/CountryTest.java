package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Country;
import io.commercelayer.api.operation.DeleteAccountCountriesId;
import io.commercelayer.api.operation.GetAccountCountriesId;
import io.commercelayer.api.operation.PostAccountCountries;
import io.commercelayer.api.operation.PutAccountCountriesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * CountryTest
 */
public class CountryTest extends IntegrationTest<Country> {

	@Override
	public ApiResponse<Country> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountCountries postOp = ApiOperations.PostAccountCountries();
	
		Country res = new Country();
	
		res.setCode("code");
		// FIELD NOT FOUND -> res.setCountryGroupId("countryGroupId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountCountries> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Country> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getCode());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCountryGroupId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Country> crudReadTest(Country res, ApiCaller caller) {
	
		// GET
	
		GetAccountCountriesId getOp = ApiOperations.GetAccountCountriesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountCountriesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Country> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Country> crudUpdateTest(Country oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountCountriesId putOp = ApiOperations.PutAccountCountriesId();
		putOp.setId(oldRes.getId());
	
		Country res = new Country();
	
		res.setCode(randomField(oldRes.getCode()));
		// FIELD NOT FOUND -> res.setCountryGroupId(randomField(oldRes.getCountryGroupId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountCountriesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Country> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getCode(), putRes.getResource().getCode());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCountryGroupId(), putRes.getResource().getCountryGroupId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Country> crudDeleteTest(Country res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountCountriesId delOp = ApiOperations.DeleteAccountCountriesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountCountriesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Country> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountCountriesId getOp = ApiOperations.GetAccountCountriesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountCountriesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Country> getRes = null;
	
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
	
		CountryTest test = new CountryTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
