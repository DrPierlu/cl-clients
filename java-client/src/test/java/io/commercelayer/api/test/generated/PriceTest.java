package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Price;
import io.commercelayer.api.operation.DeleteAccountPricesId;
import io.commercelayer.api.operation.GetAccountPricesId;
import io.commercelayer.api.operation.PostAccountPrices;
import io.commercelayer.api.operation.PutAccountPricesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * PriceTest
 */
public class PriceTest extends IntegrationTest<Price> {

	@Override
	public ApiResponse<Price> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountPrices postOp = ApiOperations.PostAccountPrices();
	
		Price res = new Price();
	
		res.setAmount("amount");
		// FIELD NOT FOUND -> res.setSellableResource("sellableResource");
		// FIELD NOT FOUND -> res.setPriceListId("priceListId");
		// FIELD NOT FOUND -> res.setSellableId("sellableId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountPrices> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Price> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getAmount());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getSellableResource());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPriceListId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getSellableId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Price> crudReadTest(Price res, ApiCaller caller) {
	
		// GET
	
		GetAccountPricesId getOp = ApiOperations.GetAccountPricesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountPricesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Price> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Price> crudUpdateTest(Price oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountPricesId putOp = ApiOperations.PutAccountPricesId();
		putOp.setId(oldRes.getId());
	
		Price res = new Price();
	
		res.setAmount(randomField(oldRes.getAmount()));
		// FIELD NOT FOUND -> res.setSellableResource(randomField(oldRes.getSellableResource()));
		// FIELD NOT FOUND -> res.setPriceListId(randomField(oldRes.getPriceListId()));
		// FIELD NOT FOUND -> res.setSellableId(randomField(oldRes.getSellableId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountPricesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Price> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getAmount(), putRes.getResource().getAmount());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getSellableResource(), putRes.getResource().getSellableResource());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPriceListId(), putRes.getResource().getPriceListId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getSellableId(), putRes.getResource().getSellableId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Price> crudDeleteTest(Price res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountPricesId delOp = ApiOperations.DeleteAccountPricesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountPricesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Price> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountPricesId getOp = ApiOperations.GetAccountPricesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountPricesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Price> getRes = null;
	
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
	
		PriceTest test = new PriceTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
