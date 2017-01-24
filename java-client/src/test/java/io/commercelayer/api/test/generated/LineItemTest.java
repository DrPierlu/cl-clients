package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.LineItem;
import io.commercelayer.api.operation.DeleteChannelLineItemsId;
import io.commercelayer.api.operation.GetChannelLineItemsId;
import io.commercelayer.api.operation.PostChannelOrdersOrderTokenLineItems;
import io.commercelayer.api.operation.PutChannelLineItemsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * LineItemTest
 */
public class LineItemTest extends IntegrationTest<LineItem> {

	@Override
	public ApiResponse<LineItem> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostChannelOrdersOrderTokenLineItems postOp = ApiOperations.PostChannelOrdersOrderTokenLineItems();
	
		LineItem res = new LineItem();
	
		// FIELD TYPE MISMATCH -> res.setQuantity("quantity");
		// FIELD NOT FOUND -> res.setSellableResource("sellableResource");
		// FIELD NOT FOUND -> res.setSellableId("sellableId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostChannelOrdersOrderTokenLineItems> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<LineItem> postRes = test(postReq, caller);
	
	
		// FIELD TYPE MISMATCH -> Assert.assertNotNull(postRes.getResource().getQuantity());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getSellableResource());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getSellableId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<LineItem> crudReadTest(LineItem res, ApiCaller caller) {
	
		// GET
	
		GetChannelLineItemsId getOp = ApiOperations.GetChannelLineItemsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetChannelLineItemsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<LineItem> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<LineItem> crudUpdateTest(LineItem oldRes, ApiCaller caller) {
	
		// PUT
	
		PutChannelLineItemsId putOp = ApiOperations.PutChannelLineItemsId();
		putOp.setId(oldRes.getId());
	
		LineItem res = new LineItem();
	
		// FIELD TYPE MISMATCH -> res.setQuantity(randomField(oldRes.getQuantity()));
		// FIELD NOT FOUND -> res.setSellableResource(randomField(oldRes.getSellableResource()));
		// FIELD NOT FOUND -> res.setSellableId(randomField(oldRes.getSellableId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutChannelLineItemsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<LineItem> putRes = test(putReq, caller);
	
	
		// FIELD TYPE MISMATCH -> Assert.assertNotEquals(oldRes.getQuantity(), putRes.getResource().getQuantity());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getSellableResource(), putRes.getResource().getSellableResource());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getSellableId(), putRes.getResource().getSellableId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<LineItem> crudDeleteTest(LineItem res, ApiCaller caller) {
	
		// DELETE
	
		DeleteChannelLineItemsId delOp = ApiOperations.DeleteChannelLineItemsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteChannelLineItemsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<LineItem> delRes = test(delReq, caller);
	
		// GET
	
		GetChannelLineItemsId getOp = ApiOperations.GetChannelLineItemsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetChannelLineItemsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<LineItem> getRes = null;
	
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
	
		LineItemTest test = new LineItemTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
