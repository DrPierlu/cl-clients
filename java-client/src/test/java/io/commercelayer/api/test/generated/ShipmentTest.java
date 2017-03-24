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
	
		// FIELD NOT FOUND -> res.setOrderId("orderId");
		// FIELD NOT FOUND -> res.setStockLocationId("stockLocationId");
		// FIELD NOT FOUND -> res.setShippingMethodId("shippingMethodId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountShipments> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Shipment> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getOrderId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getStockLocationId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingMethodId());
	
	
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
	
		// FIELD NOT FOUND -> res.setOrderId(randomField(oldRes.getOrderId()));
		// FIELD NOT FOUND -> res.setStockLocationId(randomField(oldRes.getStockLocationId()));
		// FIELD NOT FOUND -> res.setShippingMethodId(randomField(oldRes.getShippingMethodId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountShipmentsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Shipment> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getOrderId(), putRes.getResource().getOrderId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getStockLocationId(), putRes.getResource().getStockLocationId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingMethodId(), putRes.getResource().getShippingMethodId());
	
	
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
