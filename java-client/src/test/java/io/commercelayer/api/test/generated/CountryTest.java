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
	
		// FIELD NOT FOUND -> res.setCustomsItemIds("customsItemIds");
		res.setCode("code");
		// FIELD NOT FOUND -> res.setLineItemIds("lineItemIds");
		// FIELD NOT FOUND -> res.setStateIds("stateIds");
		// FIELD NOT FOUND -> res.setLanguageIds("languageIds");
		// FIELD NOT FOUND -> res.setCountryGroupId("countryGroupId");
		// FIELD NOT FOUND -> res.setOrderIds("orderIds");
		// FIELD NOT FOUND -> res.setCurrencyId("currencyId");
		// FIELD NOT FOUND -> res.setPriceListIds("priceListIds");
		// FIELD NOT FOUND -> res.setCountryLanguageIds("countryLanguageIds");
		// FIELD NOT FOUND -> res.setInvoiceIds("invoiceIds");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountCountries> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Country> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCustomsItemIds());
		Assert.assertNotNull(postRes.getResource().getCode());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getLineItemIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getStateIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getLanguageIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCountryGroupId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getOrderIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCurrencyId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPriceListIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCountryLanguageIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getInvoiceIds());
	
	
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
	
		// FIELD NOT FOUND -> res.setCustomsItemIds(randomField(oldRes.getCustomsItemIds()));
		res.setCode(randomField(oldRes.getCode()));
		// FIELD NOT FOUND -> res.setLineItemIds(randomField(oldRes.getLineItemIds()));
		// FIELD NOT FOUND -> res.setStateIds(randomField(oldRes.getStateIds()));
		// FIELD NOT FOUND -> res.setLanguageIds(randomField(oldRes.getLanguageIds()));
		// FIELD NOT FOUND -> res.setCountryGroupId(randomField(oldRes.getCountryGroupId()));
		// FIELD NOT FOUND -> res.setOrderIds(randomField(oldRes.getOrderIds()));
		// FIELD NOT FOUND -> res.setCurrencyId(randomField(oldRes.getCurrencyId()));
		// FIELD NOT FOUND -> res.setPriceListIds(randomField(oldRes.getPriceListIds()));
		// FIELD NOT FOUND -> res.setCountryLanguageIds(randomField(oldRes.getCountryLanguageIds()));
		// FIELD NOT FOUND -> res.setInvoiceIds(randomField(oldRes.getInvoiceIds()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountCountriesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Country> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCustomsItemIds(), putRes.getResource().getCustomsItemIds());
		Assert.assertNotEquals(oldRes.getCode(), putRes.getResource().getCode());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getLineItemIds(), putRes.getResource().getLineItemIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getStateIds(), putRes.getResource().getStateIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getLanguageIds(), putRes.getResource().getLanguageIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCountryGroupId(), putRes.getResource().getCountryGroupId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getOrderIds(), putRes.getResource().getOrderIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCurrencyId(), putRes.getResource().getCurrencyId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPriceListIds(), putRes.getResource().getPriceListIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCountryLanguageIds(), putRes.getResource().getCountryLanguageIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getInvoiceIds(), putRes.getResource().getInvoiceIds());
	
	
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
