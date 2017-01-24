package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.CountryLanguage;
import io.commercelayer.api.operation.DeleteAccountCountryLanguagesId;
import io.commercelayer.api.operation.GetAccountCountryLanguagesId;
import io.commercelayer.api.operation.PostAccountCountryLanguages;
import io.commercelayer.api.operation.PutAccountCountryLanguagesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * CountryLanguageTest
 */
public class CountryLanguageTest extends IntegrationTest<CountryLanguage> {

	@Override
	public ApiResponse<CountryLanguage> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountCountryLanguages postOp = ApiOperations.PostAccountCountryLanguages();
	
		CountryLanguage res = new CountryLanguage();
	
		// FIELD NOT FOUND -> res.setLanguageId("languageId");
		// FIELD NOT FOUND -> res.setCountryId("countryId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountCountryLanguages> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<CountryLanguage> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getLanguageId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCountryId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<CountryLanguage> crudReadTest(CountryLanguage res, ApiCaller caller) {
	
		// GET
	
		GetAccountCountryLanguagesId getOp = ApiOperations.GetAccountCountryLanguagesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountCountryLanguagesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<CountryLanguage> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<CountryLanguage> crudUpdateTest(CountryLanguage oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountCountryLanguagesId putOp = ApiOperations.PutAccountCountryLanguagesId();
		putOp.setId(oldRes.getId());
	
		CountryLanguage res = new CountryLanguage();
	
		// FIELD NOT FOUND -> res.setLanguageId(randomField(oldRes.getLanguageId()));
		// FIELD NOT FOUND -> res.setCountryId(randomField(oldRes.getCountryId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountCountryLanguagesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<CountryLanguage> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getLanguageId(), putRes.getResource().getLanguageId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCountryId(), putRes.getResource().getCountryId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<CountryLanguage> crudDeleteTest(CountryLanguage res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountCountryLanguagesId delOp = ApiOperations.DeleteAccountCountryLanguagesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountCountryLanguagesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<CountryLanguage> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountCountryLanguagesId getOp = ApiOperations.GetAccountCountryLanguagesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountCountryLanguagesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<CountryLanguage> getRes = null;
	
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
	
		CountryLanguageTest test = new CountryLanguageTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
