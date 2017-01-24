package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Market;
import io.commercelayer.api.operation.DeleteAccountMarketsId;
import io.commercelayer.api.operation.GetAccountMarketsId;
import io.commercelayer.api.operation.PostAccountMarkets;
import io.commercelayer.api.operation.PutAccountMarketsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * MarketTest
 */
public class MarketTest extends IntegrationTest<Market> {

	@Override
	public ApiResponse<Market> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountMarkets postOp = ApiOperations.PostAccountMarkets();
	
		Market res = new Market();
	
		// FIELD NOT FOUND -> res.setCatalogId("catalogId");
		// FIELD NOT FOUND -> res.setMerchantId("merchantId");
		// FIELD NOT FOUND -> res.setPriceListId("priceListId");
		// FIELD NOT FOUND -> res.setCountryGroupId("countryGroupId");
		// FIELD NOT FOUND -> res.setOrderValidatorId("orderValidatorId");
		// FIELD NOT FOUND -> res.setChannelId("channelId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountMarkets> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Market> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCatalogId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMerchantId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPriceListId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCountryGroupId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getOrderValidatorId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getChannelId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Market> crudReadTest(Market res, ApiCaller caller) {
	
		// GET
	
		GetAccountMarketsId getOp = ApiOperations.GetAccountMarketsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountMarketsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Market> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Market> crudUpdateTest(Market oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountMarketsId putOp = ApiOperations.PutAccountMarketsId();
		putOp.setId(oldRes.getId());
	
		Market res = new Market();
	
		// FIELD NOT FOUND -> res.setCatalogId(randomField(oldRes.getCatalogId()));
		// FIELD NOT FOUND -> res.setMerchantId(randomField(oldRes.getMerchantId()));
		// FIELD NOT FOUND -> res.setPriceListId(randomField(oldRes.getPriceListId()));
		// FIELD NOT FOUND -> res.setCountryGroupId(randomField(oldRes.getCountryGroupId()));
		// FIELD NOT FOUND -> res.setOrderValidatorId(randomField(oldRes.getOrderValidatorId()));
		// FIELD NOT FOUND -> res.setChannelId(randomField(oldRes.getChannelId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountMarketsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Market> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCatalogId(), putRes.getResource().getCatalogId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMerchantId(), putRes.getResource().getMerchantId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPriceListId(), putRes.getResource().getPriceListId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCountryGroupId(), putRes.getResource().getCountryGroupId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getOrderValidatorId(), putRes.getResource().getOrderValidatorId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getChannelId(), putRes.getResource().getChannelId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Market> crudDeleteTest(Market res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountMarketsId delOp = ApiOperations.DeleteAccountMarketsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountMarketsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Market> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountMarketsId getOp = ApiOperations.GetAccountMarketsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountMarketsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Market> getRes = null;
	
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
	
		MarketTest test = new MarketTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
