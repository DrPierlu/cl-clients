package io.commercelayer.api.test.resource;

import org.junit.Assert;

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

/**
 * CountryTest
 */
public class CountryTest extends IntegrationTest<Country> {

	@Override
	public ApiResponse<Country> testCreate(ApiCaller caller) {

		// POST

		PostAccountCountries postOp = ApiOperations.PostAccountCountries();

		Country a = new Country();

		a.setName(randomField("Country"));
		a.setCountryGroupId(randomValue());
		a.setCode(io.commercelayer.api.domain.Country.ITALY);

		postOp.setPayload(a);

		ApiRequest<PostAccountCountries> postReq = new ApiRequest<>(postOp);
		ApiResponse<Country> postRes = test(postReq, Country.class, caller);

		Assert.assertNotNull(postRes.getResource().getId());

		return postRes;

	}


	@Override
	public ApiResponse<Country> testRead(Country res, ApiCaller caller) {

		// GET

		GetAccountCountriesId getOp = ApiOperations.GetAccountCountriesId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountCountriesId> getReq = new ApiRequest<>(getOp);

		ApiResponse<Country> getRes = test(getReq, Country.class, caller);

		Assert.assertNotNull(getRes.getResource().getName());
		Assert.assertNotNull(getRes.getResource().getCountryGroupId());
		Assert.assertNotNull(getRes.getResource().getCode());

		return getRes;

	}


	@Override
	public ApiResponse<Country> testUpdate(Country oldRes, ApiCaller caller) {

		// PUT

		PutAccountCountriesId putOp = ApiOperations.PutAccountCountriesId();
		putOp.setId(oldRes.getId());

		Country a = new Country();

		a.setName(randomField(oldRes.getName()));
		a.setCountryGroupId(randomValue());
		a.setCode(io.commercelayer.api.domain.Country.UNITED_STATES);

		putOp.setPayload(a);

		ApiRequest<PutAccountCountriesId> putReq = new ApiRequest<>(putOp);
		ApiResponse<Country> putRes = test(putReq, Country.class, caller);

		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		Assert.assertNotEquals(oldRes.getCountryGroupId(), putRes.getResource().getCountryGroupId());
		Assert.assertNotEquals(oldRes.getCode(), putRes.getResource().getCode());

		return putRes;

	}


	@Override
	public ApiResponse<Country> testDelete(Country res, ApiCaller caller) {

		// DELETE

		DeleteAccountCountriesId delOp = ApiOperations.DeleteAccountCountriesId();
		delOp.setId(res.getId());

		ApiRequest<DeleteAccountCountriesId> delReq = new ApiRequest<>(delOp);

		ApiResponse<Country> delRes = test(delReq, caller);

		// GET

		GetAccountCountriesId getOp = ApiOperations.GetAccountCountriesId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountCountriesId> getReq = new ApiRequest<>(getOp);

		ApiResponse<Country> getRes = test(getReq, Country.class, caller, false);

		Assert.assertNull(getRes.getResource());

		return delRes;

	}


	public static void main(String[] args) {

		CountryTest test = new CountryTest();

		test.runTest();

		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();

	}

}
