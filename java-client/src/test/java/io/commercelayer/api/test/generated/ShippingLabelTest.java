package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingLabel;
import io.commercelayer.api.operation.DeleteAccountShippingLabelsId;
import io.commercelayer.api.operation.GetAccountShippingLabelsId;
import io.commercelayer.api.operation.PostAccountShippingLabels;
import io.commercelayer.api.operation.PutAccountShippingLabelsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ShippingLabelTest
 */
public class ShippingLabelTest extends IntegrationTest<ShippingLabel> {

	@Override
	public ApiResponse<ShippingLabel> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountShippingLabels postOp = ApiOperations.PostAccountShippingLabels();
	
		ShippingLabel res = new ShippingLabel();
	
		// FIELD NOT FOUND -> res.setShipmentId("shipmentId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountShippingLabels> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ShippingLabel> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShipmentId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ShippingLabel> crudReadTest(ShippingLabel res, ApiCaller caller) {
	
		// GET
	
		GetAccountShippingLabelsId getOp = ApiOperations.GetAccountShippingLabelsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountShippingLabelsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingLabel> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ShippingLabel> crudUpdateTest(ShippingLabel oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountShippingLabelsId putOp = ApiOperations.PutAccountShippingLabelsId();
		putOp.setId(oldRes.getId());
	
		ShippingLabel res = new ShippingLabel();
	
		// FIELD NOT FOUND -> res.setShipmentId(randomField(oldRes.getShipmentId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountShippingLabelsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ShippingLabel> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShipmentId(), putRes.getResource().getShipmentId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ShippingLabel> crudDeleteTest(ShippingLabel res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountShippingLabelsId delOp = ApiOperations.DeleteAccountShippingLabelsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountShippingLabelsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ShippingLabel> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountShippingLabelsId getOp = ApiOperations.GetAccountShippingLabelsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountShippingLabelsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingLabel> getRes = null;
	
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
	
		ShippingLabelTest test = new ShippingLabelTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
