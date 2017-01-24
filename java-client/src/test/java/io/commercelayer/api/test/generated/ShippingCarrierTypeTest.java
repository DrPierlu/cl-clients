package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingCarrierType;
import io.commercelayer.api.operation.DeleteAccountShippingCarrierTypesId;
import io.commercelayer.api.operation.GetAccountShippingCarrierTypesId;
import io.commercelayer.api.operation.PostAccountShippingCarrierTypes;
import io.commercelayer.api.operation.PutAccountShippingCarrierTypesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ShippingCarrierTypeTest
 */
public class ShippingCarrierTypeTest extends IntegrationTest<ShippingCarrierType> {

	@Override
	public ApiResponse<ShippingCarrierType> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountShippingCarrierTypes postOp = ApiOperations.PostAccountShippingCarrierTypes();
	
		ShippingCarrierType res = new ShippingCarrierType();
	
		res.setName("name");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountShippingCarrierTypes> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ShippingCarrierType> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getName());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ShippingCarrierType> crudReadTest(ShippingCarrierType res, ApiCaller caller) {
	
		// GET
	
		GetAccountShippingCarrierTypesId getOp = ApiOperations.GetAccountShippingCarrierTypesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountShippingCarrierTypesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingCarrierType> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ShippingCarrierType> crudUpdateTest(ShippingCarrierType oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountShippingCarrierTypesId putOp = ApiOperations.PutAccountShippingCarrierTypesId();
		putOp.setId(oldRes.getId());
	
		ShippingCarrierType res = new ShippingCarrierType();
	
		res.setName(randomField(oldRes.getName()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountShippingCarrierTypesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ShippingCarrierType> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ShippingCarrierType> crudDeleteTest(ShippingCarrierType res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountShippingCarrierTypesId delOp = ApiOperations.DeleteAccountShippingCarrierTypesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountShippingCarrierTypesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ShippingCarrierType> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountShippingCarrierTypesId getOp = ApiOperations.GetAccountShippingCarrierTypesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountShippingCarrierTypesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingCarrierType> getRes = null;
	
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
	
		ShippingCarrierTypeTest test = new ShippingCarrierTypeTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
