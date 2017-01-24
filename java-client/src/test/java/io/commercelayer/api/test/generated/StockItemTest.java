package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.StockItem;
import io.commercelayer.api.operation.DeleteAccountStockItemsId;
import io.commercelayer.api.operation.GetAccountStockItemsId;
import io.commercelayer.api.operation.PostAccountStockItems;
import io.commercelayer.api.operation.PutAccountStockItemsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * StockItemTest
 */
public class StockItemTest extends IntegrationTest<StockItem> {

	@Override
	public ApiResponse<StockItem> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountStockItems postOp = ApiOperations.PostAccountStockItems();
	
		StockItem res = new StockItem();
	
		// FIELD TYPE MISMATCH -> res.setQuantity("quantity");
		// FIELD NOT FOUND -> res.setStockLocationId("stockLocationId");
		// FIELD NOT FOUND -> res.setStockableId("stockableId");
		// FIELD NOT FOUND -> res.setStockableResource("stockableResource");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountStockItems> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<StockItem> postRes = test(postReq, caller);
	
	
		// FIELD TYPE MISMATCH -> Assert.assertNotNull(postRes.getResource().getQuantity());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getStockLocationId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getStockableId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getStockableResource());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<StockItem> crudReadTest(StockItem res, ApiCaller caller) {
	
		// GET
	
		GetAccountStockItemsId getOp = ApiOperations.GetAccountStockItemsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountStockItemsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<StockItem> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<StockItem> crudUpdateTest(StockItem oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountStockItemsId putOp = ApiOperations.PutAccountStockItemsId();
		putOp.setId(oldRes.getId());
	
		StockItem res = new StockItem();
	
		// FIELD TYPE MISMATCH -> res.setQuantity(randomField(oldRes.getQuantity()));
		// FIELD NOT FOUND -> res.setStockLocationId(randomField(oldRes.getStockLocationId()));
		// FIELD NOT FOUND -> res.setStockableId(randomField(oldRes.getStockableId()));
		// FIELD NOT FOUND -> res.setStockableResource(randomField(oldRes.getStockableResource()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountStockItemsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<StockItem> putRes = test(putReq, caller);
	
	
		// FIELD TYPE MISMATCH -> Assert.assertNotEquals(oldRes.getQuantity(), putRes.getResource().getQuantity());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getStockLocationId(), putRes.getResource().getStockLocationId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getStockableId(), putRes.getResource().getStockableId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getStockableResource(), putRes.getResource().getStockableResource());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<StockItem> crudDeleteTest(StockItem res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountStockItemsId delOp = ApiOperations.DeleteAccountStockItemsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountStockItemsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<StockItem> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountStockItemsId getOp = ApiOperations.GetAccountStockItemsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountStockItemsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<StockItem> getRes = null;
	
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
	
		StockItemTest test = new StockItemTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
