package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.CustomsForm;
import io.commercelayer.api.operation.DeleteAccountCustomsFormsId;
import io.commercelayer.api.operation.GetAccountCustomsFormsId;
import io.commercelayer.api.operation.PostAccountCustomsForms;
import io.commercelayer.api.operation.PutAccountCustomsFormsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * CustomsFormTest
 */
public class CustomsFormTest extends IntegrationTest<CustomsForm> {

	@Override
	public ApiResponse<CustomsForm> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountCustomsForms postOp = ApiOperations.PostAccountCustomsForms();
	
		CustomsForm res = new CustomsForm();
	
		// FIELD NOT FOUND -> res.setShipmentId("shipmentId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountCustomsForms> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<CustomsForm> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShipmentId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<CustomsForm> crudReadTest(CustomsForm res, ApiCaller caller) {
	
		// GET
	
		GetAccountCustomsFormsId getOp = ApiOperations.GetAccountCustomsFormsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountCustomsFormsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<CustomsForm> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<CustomsForm> crudUpdateTest(CustomsForm oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountCustomsFormsId putOp = ApiOperations.PutAccountCustomsFormsId();
		putOp.setId(oldRes.getId());
	
		CustomsForm res = new CustomsForm();
	
		// FIELD NOT FOUND -> res.setShipmentId(randomField(oldRes.getShipmentId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountCustomsFormsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<CustomsForm> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShipmentId(), putRes.getResource().getShipmentId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<CustomsForm> crudDeleteTest(CustomsForm res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountCustomsFormsId delOp = ApiOperations.DeleteAccountCustomsFormsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountCustomsFormsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<CustomsForm> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountCustomsFormsId getOp = ApiOperations.GetAccountCustomsFormsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountCustomsFormsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<CustomsForm> getRes = null;
	
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
	
		CustomsFormTest test = new CustomsFormTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
