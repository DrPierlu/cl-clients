package io.commercelayer.api.test.generated;

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
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * CurrencyTest
 */
public class CurrencyTest extends IntegrationTest<Currency> {

	@Override
	public ApiResponse<Currency> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountCurrencies postOp = ApiOperations.PostAccountCurrencies();
	
		Currency res = new Currency();
	
		res.setCode("code");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountCurrencies> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Currency> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getCode());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Currency> crudReadTest(Currency res, ApiCaller caller) {
	
		// GET
	
		GetAccountCurrenciesId getOp = ApiOperations.GetAccountCurrenciesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountCurrenciesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Currency> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Currency> crudUpdateTest(Currency oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountCurrenciesId putOp = ApiOperations.PutAccountCurrenciesId();
		putOp.setId(oldRes.getId());
	
		Currency res = new Currency();
	
		res.setCode(randomField(oldRes.getCode()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountCurrenciesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Currency> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getCode(), putRes.getResource().getCode());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Currency> crudDeleteTest(Currency res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountCurrenciesId delOp = ApiOperations.DeleteAccountCurrenciesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountCurrenciesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Currency> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountCurrenciesId getOp = ApiOperations.GetAccountCurrenciesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountCurrenciesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Currency> getRes = null;
	
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
	
		CurrencyTest test = new CurrencyTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
