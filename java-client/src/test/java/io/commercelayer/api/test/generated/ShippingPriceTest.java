package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingPrice;
import io.commercelayer.api.operation.DeleteAccountShippingPricesId;
import io.commercelayer.api.operation.GetAccountShippingPricesId;
import io.commercelayer.api.operation.PostAccountShippingPrices;
import io.commercelayer.api.operation.PutAccountShippingPricesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ShippingPriceTest
 */
public class ShippingPriceTest extends IntegrationTest<ShippingPrice> {

	@Override
	public ApiResponse<ShippingPrice> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountShippingPrices postOp = ApiOperations.PostAccountShippingPrices();
	
		ShippingPrice res = new ShippingPrice();
	
		// FIELD NOT FOUND -> res.setFreeOverAmount("freeOverAmount");
		res.setAmount("amount");
		// FIELD NOT FOUND -> res.setShippingServiceId("shippingServiceId");
		// FIELD NOT FOUND -> res.setPriceListId("priceListId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountShippingPrices> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ShippingPrice> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getFreeOverAmount());
		Assert.assertNotNull(postRes.getResource().getAmount());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingServiceId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPriceListId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ShippingPrice> crudReadTest(ShippingPrice res, ApiCaller caller) {
	
		// GET
	
		GetAccountShippingPricesId getOp = ApiOperations.GetAccountShippingPricesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountShippingPricesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingPrice> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ShippingPrice> crudUpdateTest(ShippingPrice oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountShippingPricesId putOp = ApiOperations.PutAccountShippingPricesId();
		putOp.setId(oldRes.getId());
	
		ShippingPrice res = new ShippingPrice();
	
		// FIELD NOT FOUND -> res.setFreeOverAmount(randomField(oldRes.getFreeOverAmount()));
		res.setAmount(randomField(oldRes.getAmount()));
		// FIELD NOT FOUND -> res.setShippingServiceId(randomField(oldRes.getShippingServiceId()));
		// FIELD NOT FOUND -> res.setPriceListId(randomField(oldRes.getPriceListId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountShippingPricesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ShippingPrice> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getFreeOverAmount(), putRes.getResource().getFreeOverAmount());
		Assert.assertNotEquals(oldRes.getAmount(), putRes.getResource().getAmount());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingServiceId(), putRes.getResource().getShippingServiceId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPriceListId(), putRes.getResource().getPriceListId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ShippingPrice> crudDeleteTest(ShippingPrice res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountShippingPricesId delOp = ApiOperations.DeleteAccountShippingPricesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountShippingPricesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ShippingPrice> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountShippingPricesId getOp = ApiOperations.GetAccountShippingPricesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountShippingPricesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingPrice> getRes = null;
	
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
	
		ShippingPriceTest test = new ShippingPriceTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
