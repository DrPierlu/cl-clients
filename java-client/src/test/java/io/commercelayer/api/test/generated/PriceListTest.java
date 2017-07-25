package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PriceList;
import io.commercelayer.api.operation.DeleteAccountPriceListsId;
import io.commercelayer.api.operation.GetAccountPriceListsId;
import io.commercelayer.api.operation.PostAccountPriceLists;
import io.commercelayer.api.operation.PutAccountPriceListsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * PriceListTest
 */
public class PriceListTest extends IntegrationTest<PriceList> {

	@Override
	public ApiResponse<PriceList> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountPriceLists postOp = ApiOperations.PostAccountPriceLists();
	
		PriceList res = new PriceList();
	
		// FIELD NOT FOUND -> res.setMarketPriceListIds("marketPriceListIds");
		// FIELD NOT FOUND -> res.setTaxIncluded("taxIncluded");
		// FIELD NOT FOUND -> res.setPriceIds("priceIds");
		res.setName("name");
		// FIELD NOT FOUND -> res.setShippingPriceIds("shippingPriceIds");
		// FIELD NOT FOUND -> res.setMarketIds("marketIds");
		// FIELD NOT FOUND -> res.setCurrencyId("currencyId");
		// FIELD NOT FOUND -> res.setPaymentPriceIds("paymentPriceIds");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountPriceLists> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<PriceList> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMarketPriceListIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getTaxIncluded());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPriceIds());
		Assert.assertNotNull(postRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingPriceIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMarketIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCurrencyId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPaymentPriceIds());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<PriceList> crudReadTest(PriceList res, ApiCaller caller) {
	
		// GET
	
		GetAccountPriceListsId getOp = ApiOperations.GetAccountPriceListsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountPriceListsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<PriceList> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<PriceList> crudUpdateTest(PriceList oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountPriceListsId putOp = ApiOperations.PutAccountPriceListsId();
		putOp.setId(oldRes.getId());
	
		PriceList res = new PriceList();
	
		// FIELD NOT FOUND -> res.setMarketPriceListIds(randomField(oldRes.getMarketPriceListIds()));
		// FIELD NOT FOUND -> res.setTaxIncluded(randomField(oldRes.getTaxIncluded()));
		// FIELD NOT FOUND -> res.setPriceIds(randomField(oldRes.getPriceIds()));
		res.setName(randomField(oldRes.getName()));
		// FIELD NOT FOUND -> res.setShippingPriceIds(randomField(oldRes.getShippingPriceIds()));
		// FIELD NOT FOUND -> res.setMarketIds(randomField(oldRes.getMarketIds()));
		// FIELD NOT FOUND -> res.setCurrencyId(randomField(oldRes.getCurrencyId()));
		// FIELD NOT FOUND -> res.setPaymentPriceIds(randomField(oldRes.getPaymentPriceIds()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountPriceListsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<PriceList> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMarketPriceListIds(), putRes.getResource().getMarketPriceListIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getTaxIncluded(), putRes.getResource().getTaxIncluded());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPriceIds(), putRes.getResource().getPriceIds());
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingPriceIds(), putRes.getResource().getShippingPriceIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMarketIds(), putRes.getResource().getMarketIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCurrencyId(), putRes.getResource().getCurrencyId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPaymentPriceIds(), putRes.getResource().getPaymentPriceIds());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<PriceList> crudDeleteTest(PriceList res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountPriceListsId delOp = ApiOperations.DeleteAccountPriceListsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountPriceListsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<PriceList> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountPriceListsId getOp = ApiOperations.GetAccountPriceListsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountPriceListsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<PriceList> getRes = null;
	
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
	
		PriceListTest test = new PriceListTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
