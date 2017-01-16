package io.commercelayer.api.test.resource;

import org.junit.Assert;

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

/**
 * CountryLanguageTest
 */
public class CountryLanguageTest extends IntegrationTest<CountryLanguage> {

	@Override
	public ApiResponse<CountryLanguage> testCreate(ApiCaller caller) {

		// POST

		PostAccountCountryLanguages postOp = ApiOperations.PostAccountCountryLanguages();

		CountryLanguage a = new CountryLanguage();

		a.setName("CountryLanguage");
		a.setCountryId(randomValue());
		a.setLanguageId(randomValue());

		postOp.setPayload(a);

		ApiRequest<PostAccountCountryLanguages> postReq = new ApiRequest<>(postOp);
		ApiResponse<CountryLanguage> postRes = test(postReq, CountryLanguage.class, caller);

		Assert.assertNotNull(postRes.getResource().getId());
		Assert.assertNotNull(postRes.getResource().getName());
		Assert.assertNotNull(postRes.getResource().getCountryId());
		Assert.assertNotNull(postRes.getResource().getLanguageId());

		return postRes;

	}


	@Override
	public ApiResponse<CountryLanguage> testRead(CountryLanguage res, ApiCaller caller) {

		// GET

		GetAccountCountryLanguagesId getOp = ApiOperations.GetAccountCountryLanguagesId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountCountryLanguagesId> getReq = new ApiRequest<>(getOp);

		ApiResponse<CountryLanguage> getRes = test(getReq, CountryLanguage.class, caller);

		Assert.assertNotNull(getRes.getResource().getName());
		Assert.assertNotNull(getRes.getResource().getCountryId());
		Assert.assertNotNull(getRes.getResource().getLanguageId());

		return getRes;

	}


	@Override
	public ApiResponse<CountryLanguage> testUpdate(CountryLanguage oldRes, ApiCaller caller) {

		// PUT

		PutAccountCountryLanguagesId putOp = ApiOperations.PutAccountCountryLanguagesId();
		putOp.setId(oldRes.getId());

		CountryLanguage a = new CountryLanguage();

		a.setName(randomField(a.getName()));

		putOp.setPayload(a);

		ApiRequest<PutAccountCountryLanguagesId> putReq = new ApiRequest<>(putOp);
		ApiResponse<CountryLanguage> putRes = test(putReq, CountryLanguage.class, caller);

		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		Assert.assertNotEquals(oldRes.getCountryId(), putRes.getResource().getCountryId());
		Assert.assertNotEquals(oldRes.getLanguageId(), putRes.getResource().getLanguageId());

		return putRes;

	}


	@Override
	public ApiResponse<CountryLanguage> testDelete(CountryLanguage res, ApiCaller caller) {

		// DELETE

		DeleteAccountCountryLanguagesId delOp = ApiOperations.DeleteAccountCountryLanguagesId();
		delOp.setId(res.getId());

		ApiRequest<DeleteAccountCountryLanguagesId> delReq = new ApiRequest<>(delOp);

		ApiResponse<CountryLanguage> delRes = test(delReq, caller);

		// GET

		GetAccountCountryLanguagesId getOp = ApiOperations.GetAccountCountryLanguagesId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountCountryLanguagesId> getReq = new ApiRequest<>(getOp);

		ApiResponse<CountryLanguage> getRes = test(getReq, CountryLanguage.class, caller, false);

		Assert.assertNull(getRes.getResource());

		return delRes;

	}


	public static void main(String[] args) {

		CountryLanguageTest test = new CountryLanguageTest();

		test.runTest();

		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();

	}

}
