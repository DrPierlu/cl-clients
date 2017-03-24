package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingService;
import io.commercelayer.api.operation.DeleteAccountShippingServicesId;
import io.commercelayer.api.operation.GetAccountShippingServicesId;
import io.commercelayer.api.operation.PostAccountShippingServices;
import io.commercelayer.api.operation.PutAccountShippingServicesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ShippingServiceTest
 */
public class ShippingServiceTest extends IntegrationTest<ShippingService> {

	@Override
	public ApiResponse<ShippingService> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountShippingServices postOp = ApiOperations.PostAccountShippingServices();
	
		ShippingService res = new ShippingService();
	
		// FIELD NOT FOUND -> res.setShippingCarrierAccountId("shippingCarrierAccountId");
		res.setKind("kind");
		res.setName("name");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountShippingServices> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ShippingService> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingCarrierAccountId());
		Assert.assertNotNull(postRes.getResource().getKind());
		Assert.assertNotNull(postRes.getResource().getName());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ShippingService> crudReadTest(ShippingService res, ApiCaller caller) {
	
		// GET
	
		GetAccountShippingServicesId getOp = ApiOperations.GetAccountShippingServicesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountShippingServicesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingService> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ShippingService> crudUpdateTest(ShippingService oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountShippingServicesId putOp = ApiOperations.PutAccountShippingServicesId();
		putOp.setId(oldRes.getId());
	
		ShippingService res = new ShippingService();
	
		// FIELD NOT FOUND -> res.setShippingCarrierAccountId(randomField(oldRes.getShippingCarrierAccountId()));
		res.setKind(randomField(oldRes.getKind()));
		res.setName(randomField(oldRes.getName()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountShippingServicesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ShippingService> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingCarrierAccountId(), putRes.getResource().getShippingCarrierAccountId());
		Assert.assertNotEquals(oldRes.getKind(), putRes.getResource().getKind());
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ShippingService> crudDeleteTest(ShippingService res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountShippingServicesId delOp = ApiOperations.DeleteAccountShippingServicesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountShippingServicesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ShippingService> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountShippingServicesId getOp = ApiOperations.GetAccountShippingServicesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountShippingServicesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingService> getRes = null;
	
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
	
		ShippingServiceTest test = new ShippingServiceTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
