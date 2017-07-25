package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.CustomsItem;
import io.commercelayer.api.operation.DeleteAccountCustomsItemsId;
import io.commercelayer.api.operation.GetAccountCustomsItemsId;
import io.commercelayer.api.operation.PostAccountCustomsItems;
import io.commercelayer.api.operation.PutAccountCustomsItemsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * CustomsItemTest
 */
public class CustomsItemTest extends IntegrationTest<CustomsItem> {

	@Override
	public ApiResponse<CustomsItem> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountCustomsItems postOp = ApiOperations.PostAccountCustomsItems();
	
		CustomsItem res = new CustomsItem();
	
		// FIELD NOT FOUND -> res.setLineItemStockId("lineItemStockId");
		// FIELD NOT FOUND -> res.setCustomsFormId("customsFormId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountCustomsItems> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<CustomsItem> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getLineItemStockId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCustomsFormId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<CustomsItem> crudReadTest(CustomsItem res, ApiCaller caller) {
	
		// GET
	
		GetAccountCustomsItemsId getOp = ApiOperations.GetAccountCustomsItemsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountCustomsItemsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<CustomsItem> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<CustomsItem> crudUpdateTest(CustomsItem oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountCustomsItemsId putOp = ApiOperations.PutAccountCustomsItemsId();
		putOp.setId(oldRes.getId());
	
		CustomsItem res = new CustomsItem();
	
		// FIELD NOT FOUND -> res.setLineItemStockId(randomField(oldRes.getLineItemStockId()));
		// FIELD NOT FOUND -> res.setCustomsFormId(randomField(oldRes.getCustomsFormId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountCustomsItemsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<CustomsItem> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getLineItemStockId(), putRes.getResource().getLineItemStockId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCustomsFormId(), putRes.getResource().getCustomsFormId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<CustomsItem> crudDeleteTest(CustomsItem res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountCustomsItemsId delOp = ApiOperations.DeleteAccountCustomsItemsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountCustomsItemsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<CustomsItem> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountCustomsItemsId getOp = ApiOperations.GetAccountCustomsItemsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountCustomsItemsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<CustomsItem> getRes = null;
	
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
	
		CustomsItemTest test = new CustomsItemTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
