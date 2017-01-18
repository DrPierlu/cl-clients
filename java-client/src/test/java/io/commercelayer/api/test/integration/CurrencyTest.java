package io.commercelayer.api.test.integration;

import org.junit.Assert;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Currency;
import io.commercelayer.api.operation.DeleteAccountCurrenciesId;
import io.commercelayer.api.operation.GetAccountCurrenciesId;
import io.commercelayer.api.operation.PostAccountCurrencies;
import io.commercelayer.api.operation.PutAccountCurrenciesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * CurrencyTest
 */
public class CurrencyTest extends IntegrationTest<Currency> {

	@Override
	public ApiResponse<Currency> testCreate(ApiCaller caller) {

		// POST

		PostAccountCurrencies postOp = ApiOperations.PostAccountCurrencies();

		Currency a = new Currency();

		a.setName(randomField("Currency"));
		a.setCode(randomField("code"));

		postOp.setPayload(a);

		ApiRequest<PostAccountCurrencies> postReq = new ApiRequest<>(postOp);
		ApiResponse<Currency> postRes = test(postReq, Currency.class, caller);

		Assert.assertNotNull(postRes.getResource().getId());

		return postRes;

	}


	@Override
	public ApiResponse<Currency> testRead(Currency res, ApiCaller caller) {

		// GET

		GetAccountCurrenciesId getOp = ApiOperations.GetAccountCurrenciesId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountCurrenciesId> getReq = new ApiRequest<>(getOp);

		ApiResponse<Currency> getRes = test(getReq, Currency.class, caller);

		Assert.assertNotNull(getRes.getResource().getName());
		Assert.assertNotNull(getRes.getResource().getCode());

		return getRes;

	}


	@Override
	public ApiResponse<Currency> testUpdate(Currency oldRes, ApiCaller caller) {

		// PUT

		PutAccountCurrenciesId putOp = ApiOperations.PutAccountCurrenciesId();
		putOp.setId(oldRes.getId());

		Currency a = new Currency();

		a.setName(randomField(oldRes.getName()));
		a.setCode(randomField(oldRes.getCode()));

		putOp.setPayload(a);

		ApiRequest<PutAccountCurrenciesId> putReq = new ApiRequest<>(putOp);
		ApiResponse<Currency> putRes = test(putReq, Currency.class, caller);

		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		Assert.assertNotEquals(oldRes.getCode(), putRes.getResource().getCode());

		return putRes;

	}


	@Override
	public ApiResponse<Currency> testDelete(Currency res, ApiCaller caller) {

		// DELETE

		DeleteAccountCurrenciesId delOp = ApiOperations.DeleteAccountCurrenciesId();
		delOp.setId(res.getId());

		ApiRequest<DeleteAccountCurrenciesId> delReq = new ApiRequest<>(delOp);

		ApiResponse<Currency> delRes = test(delReq, caller);

		// GET

		GetAccountCurrenciesId getOp = ApiOperations.GetAccountCurrenciesId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountCurrenciesId> getReq = new ApiRequest<>(getOp);

		ApiResponse<Currency> getRes = test(getReq, Currency.class, caller, false);

		Assert.assertNull(getRes.getResource());

		return delRes;

	}


	public static void main(String[] args) {

		CurrencyTest test = new CurrencyTest();

		test.runTest();

		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();

	}

}
