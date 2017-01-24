package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingServiceZone;
import io.commercelayer.api.operation.DeleteAccountShippingServiceZonesId;
import io.commercelayer.api.operation.GetAccountShippingServiceZonesId;
import io.commercelayer.api.operation.PostAccountShippingServiceZones;
import io.commercelayer.api.operation.PutAccountShippingServiceZonesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ShippingServiceZoneTest
 */
public class ShippingServiceZoneTest extends IntegrationTest<ShippingServiceZone> {

	@Override
	public ApiResponse<ShippingServiceZone> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountShippingServiceZones postOp = ApiOperations.PostAccountShippingServiceZones();
	
		ShippingServiceZone res = new ShippingServiceZone();
	
		// FIELD NOT FOUND -> res.setShippingZoneId("shippingZoneId");
		// FIELD NOT FOUND -> res.setShippingServiceId("shippingServiceId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountShippingServiceZones> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ShippingServiceZone> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingZoneId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingServiceId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ShippingServiceZone> crudReadTest(ShippingServiceZone res, ApiCaller caller) {
	
		// GET
	
		GetAccountShippingServiceZonesId getOp = ApiOperations.GetAccountShippingServiceZonesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountShippingServiceZonesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingServiceZone> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ShippingServiceZone> crudUpdateTest(ShippingServiceZone oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountShippingServiceZonesId putOp = ApiOperations.PutAccountShippingServiceZonesId();
		putOp.setId(oldRes.getId());
	
		ShippingServiceZone res = new ShippingServiceZone();
	
		// FIELD NOT FOUND -> res.setShippingZoneId(randomField(oldRes.getShippingZoneId()));
		// FIELD NOT FOUND -> res.setShippingServiceId(randomField(oldRes.getShippingServiceId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountShippingServiceZonesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ShippingServiceZone> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingZoneId(), putRes.getResource().getShippingZoneId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingServiceId(), putRes.getResource().getShippingServiceId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ShippingServiceZone> crudDeleteTest(ShippingServiceZone res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountShippingServiceZonesId delOp = ApiOperations.DeleteAccountShippingServiceZonesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountShippingServiceZonesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ShippingServiceZone> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountShippingServiceZonesId getOp = ApiOperations.GetAccountShippingServiceZonesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountShippingServiceZonesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingServiceZone> getRes = null;
	
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
	
		ShippingServiceZoneTest test = new ShippingServiceZoneTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
