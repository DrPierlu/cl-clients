package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.MarketPriceList;
import io.commercelayer.api.operation.DeleteAccountMarketPriceListsId;
import io.commercelayer.api.operation.GetAccountMarketPriceListsId;
import io.commercelayer.api.operation.PostAccountMarketPriceLists;
import io.commercelayer.api.operation.PutAccountMarketPriceListsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * MarketPriceListTest
 */
public class MarketPriceListTest extends IntegrationTest<MarketPriceList> {

	@Override
	public ApiResponse<MarketPriceList> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountMarketPriceLists postOp = ApiOperations.PostAccountMarketPriceLists();
	
		MarketPriceList res = new MarketPriceList();
	
		// FIELD NOT FOUND -> res.setPriceListId("priceListId");
		// FIELD NOT FOUND -> res.setMarketId("marketId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountMarketPriceLists> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<MarketPriceList> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPriceListId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMarketId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<MarketPriceList> crudReadTest(MarketPriceList res, ApiCaller caller) {
	
		// GET
	
		GetAccountMarketPriceListsId getOp = ApiOperations.GetAccountMarketPriceListsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountMarketPriceListsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<MarketPriceList> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<MarketPriceList> crudUpdateTest(MarketPriceList oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountMarketPriceListsId putOp = ApiOperations.PutAccountMarketPriceListsId();
		putOp.setId(oldRes.getId());
	
		MarketPriceList res = new MarketPriceList();
	
		// FIELD NOT FOUND -> res.setPriceListId(randomField(oldRes.getPriceListId()));
		// FIELD NOT FOUND -> res.setMarketId(randomField(oldRes.getMarketId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountMarketPriceListsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<MarketPriceList> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPriceListId(), putRes.getResource().getPriceListId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMarketId(), putRes.getResource().getMarketId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<MarketPriceList> crudDeleteTest(MarketPriceList res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountMarketPriceListsId delOp = ApiOperations.DeleteAccountMarketPriceListsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountMarketPriceListsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<MarketPriceList> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountMarketPriceListsId getOp = ApiOperations.GetAccountMarketPriceListsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountMarketPriceListsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<MarketPriceList> getRes = null;
	
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
	
		MarketPriceListTest test = new MarketPriceListTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
