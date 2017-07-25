package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.MarketShippingService;
import io.commercelayer.api.operation.DeleteAccountMarketShippingServicesId;
import io.commercelayer.api.operation.GetAccountMarketShippingServicesId;
import io.commercelayer.api.operation.PostAccountMarketShippingServices;
import io.commercelayer.api.operation.PutAccountMarketShippingServicesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * MarketShippingServiceTest
 */
public class MarketShippingServiceTest extends IntegrationTest<MarketShippingService> {

	@Override
	public ApiResponse<MarketShippingService> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountMarketShippingServices postOp = ApiOperations.PostAccountMarketShippingServices();
	
		MarketShippingService res = new MarketShippingService();
	
		// FIELD NOT FOUND -> res.setFreeOverAmount("freeOverAmount");
		// FIELD NOT FOUND -> res.setShippingServiceId("shippingServiceId");
		// FIELD NOT FOUND -> res.setPrice("price");
		// FIELD NOT FOUND -> res.setMarketId("marketId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountMarketShippingServices> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<MarketShippingService> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getFreeOverAmount());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingServiceId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPrice());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMarketId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<MarketShippingService> crudReadTest(MarketShippingService res, ApiCaller caller) {
	
		// GET
	
		GetAccountMarketShippingServicesId getOp = ApiOperations.GetAccountMarketShippingServicesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountMarketShippingServicesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<MarketShippingService> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<MarketShippingService> crudUpdateTest(MarketShippingService oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountMarketShippingServicesId putOp = ApiOperations.PutAccountMarketShippingServicesId();
		putOp.setId(oldRes.getId());
	
		MarketShippingService res = new MarketShippingService();
	
		// FIELD NOT FOUND -> res.setFreeOverAmount(randomField(oldRes.getFreeOverAmount()));
		// FIELD NOT FOUND -> res.setShippingServiceId(randomField(oldRes.getShippingServiceId()));
		// FIELD NOT FOUND -> res.setPrice(randomField(oldRes.getPrice()));
		// FIELD NOT FOUND -> res.setMarketId(randomField(oldRes.getMarketId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountMarketShippingServicesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<MarketShippingService> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getFreeOverAmount(), putRes.getResource().getFreeOverAmount());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingServiceId(), putRes.getResource().getShippingServiceId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPrice(), putRes.getResource().getPrice());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMarketId(), putRes.getResource().getMarketId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<MarketShippingService> crudDeleteTest(MarketShippingService res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountMarketShippingServicesId delOp = ApiOperations.DeleteAccountMarketShippingServicesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountMarketShippingServicesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<MarketShippingService> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountMarketShippingServicesId getOp = ApiOperations.GetAccountMarketShippingServicesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountMarketShippingServicesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<MarketShippingService> getRes = null;
	
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
	
		MarketShippingServiceTest test = new MarketShippingServiceTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
