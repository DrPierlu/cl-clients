package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingCarrier;
import io.commercelayer.api.operation.DeleteAccountShippingCarriersId;
import io.commercelayer.api.operation.GetAccountShippingCarriersId;
import io.commercelayer.api.operation.PostAccountShippingCarriers;
import io.commercelayer.api.operation.PutAccountShippingCarriersId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ShippingCarrierTest
 */
public class ShippingCarrierTest extends IntegrationTest<ShippingCarrier> {

	@Override
	public ApiResponse<ShippingCarrier> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountShippingCarriers postOp = ApiOperations.PostAccountShippingCarriers();
	
		ShippingCarrier res = new ShippingCarrier();
	
		res.setKind("kind");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountShippingCarriers> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ShippingCarrier> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getKind());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ShippingCarrier> crudReadTest(ShippingCarrier res, ApiCaller caller) {
	
		// GET
	
		GetAccountShippingCarriersId getOp = ApiOperations.GetAccountShippingCarriersId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountShippingCarriersId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingCarrier> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ShippingCarrier> crudUpdateTest(ShippingCarrier oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountShippingCarriersId putOp = ApiOperations.PutAccountShippingCarriersId();
		putOp.setId(oldRes.getId());
	
		ShippingCarrier res = new ShippingCarrier();
	
		res.setKind(randomField(oldRes.getKind()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountShippingCarriersId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ShippingCarrier> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getKind(), putRes.getResource().getKind());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ShippingCarrier> crudDeleteTest(ShippingCarrier res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountShippingCarriersId delOp = ApiOperations.DeleteAccountShippingCarriersId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountShippingCarriersId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ShippingCarrier> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountShippingCarriersId getOp = ApiOperations.GetAccountShippingCarriersId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountShippingCarriersId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingCarrier> getRes = null;
	
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
	
		ShippingCarrierTest test = new ShippingCarrierTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
