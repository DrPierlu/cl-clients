package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Shipment;
import io.commercelayer.api.operation.DeleteAccountShipmentsId;
import io.commercelayer.api.operation.GetAccountShipmentsId;
import io.commercelayer.api.operation.PostAccountShipments;
import io.commercelayer.api.operation.PutAccountShipmentsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ShipmentTest
 */
public class ShipmentTest extends IntegrationTest<Shipment> {

	@Override
	public ApiResponse<Shipment> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountShipments postOp = ApiOperations.PostAccountShipments();
	
		Shipment res = new Shipment();
	
		/* No payload data */
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountShipments> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Shipment> postRes = test(postReq, caller);
	
	
		/* No test assertions */
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Shipment> crudReadTest(Shipment res, ApiCaller caller) {
	
		// GET
	
		GetAccountShipmentsId getOp = ApiOperations.GetAccountShipmentsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountShipmentsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Shipment> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Shipment> crudUpdateTest(Shipment oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountShipmentsId putOp = ApiOperations.PutAccountShipmentsId();
		putOp.setId(oldRes.getId());
	
		Shipment res = new Shipment();
	
	
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountShipmentsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Shipment> putRes = test(putReq, caller);
	
	
	
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Shipment> crudDeleteTest(Shipment res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountShipmentsId delOp = ApiOperations.DeleteAccountShipmentsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountShipmentsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Shipment> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountShipmentsId getOp = ApiOperations.GetAccountShipmentsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountShipmentsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Shipment> getRes = null;
	
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
	
		ShipmentTest test = new ShipmentTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
