package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.MarketStockLocation;
import io.commercelayer.api.operation.DeleteAccountMarketStockLocationsId;
import io.commercelayer.api.operation.GetAccountMarketStockLocationsId;
import io.commercelayer.api.operation.PostAccountMarketStockLocations;
import io.commercelayer.api.operation.PutAccountMarketStockLocationsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * MarketStockLocationTest
 */
public class MarketStockLocationTest extends IntegrationTest<MarketStockLocation> {

	@Override
	public ApiResponse<MarketStockLocation> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountMarketStockLocations postOp = ApiOperations.PostAccountMarketStockLocations();
	
		MarketStockLocation res = new MarketStockLocation();
	
		// FIELD NOT FOUND -> res.setStockLocationId("stockLocationId");
		// FIELD NOT FOUND -> res.setMarketId("marketId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountMarketStockLocations> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<MarketStockLocation> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getStockLocationId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMarketId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<MarketStockLocation> crudReadTest(MarketStockLocation res, ApiCaller caller) {
	
		// GET
	
		GetAccountMarketStockLocationsId getOp = ApiOperations.GetAccountMarketStockLocationsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountMarketStockLocationsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<MarketStockLocation> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<MarketStockLocation> crudUpdateTest(MarketStockLocation oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountMarketStockLocationsId putOp = ApiOperations.PutAccountMarketStockLocationsId();
		putOp.setId(oldRes.getId());
	
		MarketStockLocation res = new MarketStockLocation();
	
		// FIELD NOT FOUND -> res.setStockLocationId(randomField(oldRes.getStockLocationId()));
		// FIELD NOT FOUND -> res.setMarketId(randomField(oldRes.getMarketId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountMarketStockLocationsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<MarketStockLocation> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getStockLocationId(), putRes.getResource().getStockLocationId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMarketId(), putRes.getResource().getMarketId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<MarketStockLocation> crudDeleteTest(MarketStockLocation res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountMarketStockLocationsId delOp = ApiOperations.DeleteAccountMarketStockLocationsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountMarketStockLocationsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<MarketStockLocation> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountMarketStockLocationsId getOp = ApiOperations.GetAccountMarketStockLocationsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountMarketStockLocationsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<MarketStockLocation> getRes = null;
	
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
	
		MarketStockLocationTest test = new MarketStockLocationTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
