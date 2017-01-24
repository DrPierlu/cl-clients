package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.MarketPaymentType;
import io.commercelayer.api.operation.DeleteAccountMarketPaymentTypesId;
import io.commercelayer.api.operation.GetAccountMarketPaymentTypesId;
import io.commercelayer.api.operation.PostAccountMarketPaymentTypes;
import io.commercelayer.api.operation.PutAccountMarketPaymentTypesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * MarketPaymentTypeTest
 */
public class MarketPaymentTypeTest extends IntegrationTest<MarketPaymentType> {

	@Override
	public ApiResponse<MarketPaymentType> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountMarketPaymentTypes postOp = ApiOperations.PostAccountMarketPaymentTypes();
	
		MarketPaymentType res = new MarketPaymentType();
	
		// FIELD NOT FOUND -> res.setPaymentTypeId("paymentTypeId");
		res.setPrice("price");
		// FIELD NOT FOUND -> res.setNotCountryCodeRegex("notCountryCodeRegex");
		// FIELD NOT FOUND -> res.setCountryCodeRegex("countryCodeRegex");
		// FIELD NOT FOUND -> res.setMarketId("marketId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountMarketPaymentTypes> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<MarketPaymentType> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPaymentTypeId());
		Assert.assertNotNull(postRes.getResource().getPrice());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getNotCountryCodeRegex());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCountryCodeRegex());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMarketId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<MarketPaymentType> crudReadTest(MarketPaymentType res, ApiCaller caller) {
	
		// GET
	
		GetAccountMarketPaymentTypesId getOp = ApiOperations.GetAccountMarketPaymentTypesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountMarketPaymentTypesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<MarketPaymentType> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<MarketPaymentType> crudUpdateTest(MarketPaymentType oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountMarketPaymentTypesId putOp = ApiOperations.PutAccountMarketPaymentTypesId();
		putOp.setId(oldRes.getId());
	
		MarketPaymentType res = new MarketPaymentType();
	
		// FIELD NOT FOUND -> res.setPaymentTypeId(randomField(oldRes.getPaymentTypeId()));
		res.setPrice(randomField(oldRes.getPrice()));
		// FIELD NOT FOUND -> res.setNotCountryCodeRegex(randomField(oldRes.getNotCountryCodeRegex()));
		// FIELD NOT FOUND -> res.setCountryCodeRegex(randomField(oldRes.getCountryCodeRegex()));
		// FIELD NOT FOUND -> res.setMarketId(randomField(oldRes.getMarketId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountMarketPaymentTypesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<MarketPaymentType> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPaymentTypeId(), putRes.getResource().getPaymentTypeId());
		Assert.assertNotEquals(oldRes.getPrice(), putRes.getResource().getPrice());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getNotCountryCodeRegex(), putRes.getResource().getNotCountryCodeRegex());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCountryCodeRegex(), putRes.getResource().getCountryCodeRegex());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMarketId(), putRes.getResource().getMarketId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<MarketPaymentType> crudDeleteTest(MarketPaymentType res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountMarketPaymentTypesId delOp = ApiOperations.DeleteAccountMarketPaymentTypesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountMarketPaymentTypesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<MarketPaymentType> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountMarketPaymentTypesId getOp = ApiOperations.GetAccountMarketPaymentTypesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountMarketPaymentTypesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<MarketPaymentType> getRes = null;
	
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
	
		MarketPaymentTypeTest test = new MarketPaymentTypeTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
