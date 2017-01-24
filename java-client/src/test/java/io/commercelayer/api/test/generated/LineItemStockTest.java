package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.LineItemStock;
import io.commercelayer.api.operation.DeleteAccountLineItemStocksId;
import io.commercelayer.api.operation.GetChannelLineItemStocksId;
import io.commercelayer.api.operation.PostAccountLineItemStocks;
import io.commercelayer.api.operation.PutChannelLineItemStocksId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * LineItemStockTest
 */
public class LineItemStockTest extends IntegrationTest<LineItemStock> {

	@Override
	public ApiResponse<LineItemStock> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountLineItemStocks postOp = ApiOperations.PostAccountLineItemStocks();
	
		LineItemStock res = new LineItemStock();
	
		// FIELD TYPE MISMATCH -> res.setQuantity("quantity");
		// FIELD NOT FOUND -> res.setLineItemId("lineItemId");
		// FIELD NOT FOUND -> res.setStockItemId("stockItemId");
		// FIELD NOT FOUND -> res.setShipmentId("shipmentId");
		// FIELD NOT FOUND -> res.setShippingMethodId("shippingMethodId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountLineItemStocks> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<LineItemStock> postRes = test(postReq, caller);
	
	
		// FIELD TYPE MISMATCH -> Assert.assertNotNull(postRes.getResource().getQuantity());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getLineItemId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getStockItemId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShipmentId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingMethodId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<LineItemStock> crudReadTest(LineItemStock res, ApiCaller caller) {
	
		// GET
	
		GetChannelLineItemStocksId getOp = ApiOperations.GetChannelLineItemStocksId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetChannelLineItemStocksId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<LineItemStock> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<LineItemStock> crudUpdateTest(LineItemStock oldRes, ApiCaller caller) {
	
		// PUT
	
		PutChannelLineItemStocksId putOp = ApiOperations.PutChannelLineItemStocksId();
		putOp.setId(oldRes.getId());
	
		LineItemStock res = new LineItemStock();
	
		// FIELD NOT FOUND -> res.setShippingMethodId(randomField(oldRes.getShippingMethodId()));
		// FIELD NOT FOUND -> res.setShippingMethodAttributes(randomField(oldRes.getShippingMethodAttributes()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutChannelLineItemStocksId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<LineItemStock> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingMethodId(), putRes.getResource().getShippingMethodId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingMethodAttributes(), putRes.getResource().getShippingMethodAttributes());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<LineItemStock> crudDeleteTest(LineItemStock res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountLineItemStocksId delOp = ApiOperations.DeleteAccountLineItemStocksId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountLineItemStocksId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<LineItemStock> delRes = test(delReq, caller);
	
		// GET
	
		GetChannelLineItemStocksId getOp = ApiOperations.GetChannelLineItemStocksId();
		getOp.setId(res.getId());
	
		ApiRequest<GetChannelLineItemStocksId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<LineItemStock> getRes = null;
	
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
	
		LineItemStockTest test = new LineItemStockTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
