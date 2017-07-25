package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingMethod;
import io.commercelayer.api.operation.DeleteChannelShippingMethodsId;
import io.commercelayer.api.operation.GetChannelShippingMethodsId;
import io.commercelayer.api.operation.PostChannelOrdersOrderTokenShippingMethods;
import io.commercelayer.api.operation.PutChannelShippingMethodsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ShippingMethodTest
 */
public class ShippingMethodTest extends IntegrationTest<ShippingMethod> {

	@Override
	public ApiResponse<ShippingMethod> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostChannelOrdersOrderTokenShippingMethods postOp = ApiOperations.PostChannelOrdersOrderTokenShippingMethods();
	
		ShippingMethod res = new ShippingMethod();
	
		// FIELD NOT FOUND -> res.setShipmentIds("shipmentIds");
		// FIELD NOT FOUND -> res.setShippingServiceId("shippingServiceId");
		// FIELD NOT FOUND -> res.setLineItemIds("lineItemIds");
		// FIELD NOT FOUND -> res.setShippingPackageId("shippingPackageId");
		// FIELD NOT FOUND -> res.setShippingRecipientId("shippingRecipientId");
		// FIELD NOT FOUND -> res.setShippingAddressId("shippingAddressId");
		// FIELD NOT FOUND -> res.setShippingRecipientAttributes("shippingRecipientAttributes");
		// FIELD NOT FOUND -> res.setShippingAddressAttributes("shippingAddressAttributes");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostChannelOrdersOrderTokenShippingMethods> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ShippingMethod> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShipmentIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingServiceId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getLineItemIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingPackageId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingRecipientId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingAddressId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingRecipientAttributes());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingAddressAttributes());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ShippingMethod> crudReadTest(ShippingMethod res, ApiCaller caller) {
	
		// GET
	
		GetChannelShippingMethodsId getOp = ApiOperations.GetChannelShippingMethodsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetChannelShippingMethodsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingMethod> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ShippingMethod> crudUpdateTest(ShippingMethod oldRes, ApiCaller caller) {
	
		// PUT
	
		PutChannelShippingMethodsId putOp = ApiOperations.PutChannelShippingMethodsId();
		putOp.setId(oldRes.getId());
	
		ShippingMethod res = new ShippingMethod();
	
		// FIELD NOT FOUND -> res.setShipmentIds(randomField(oldRes.getShipmentIds()));
		// FIELD NOT FOUND -> res.setShippingServiceId(randomField(oldRes.getShippingServiceId()));
		// FIELD NOT FOUND -> res.setLineItemIds(randomField(oldRes.getLineItemIds()));
		// FIELD NOT FOUND -> res.setShippingPackageId(randomField(oldRes.getShippingPackageId()));
		// FIELD NOT FOUND -> res.setShippingRecipientId(randomField(oldRes.getShippingRecipientId()));
		// FIELD NOT FOUND -> res.setShippingAddressId(randomField(oldRes.getShippingAddressId()));
		// FIELD NOT FOUND -> res.setShippingRecipientAttributes(randomField(oldRes.getShippingRecipientAttributes()));
		// FIELD NOT FOUND -> res.setShippingAddressAttributes(randomField(oldRes.getShippingAddressAttributes()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutChannelShippingMethodsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ShippingMethod> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShipmentIds(), putRes.getResource().getShipmentIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingServiceId(), putRes.getResource().getShippingServiceId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getLineItemIds(), putRes.getResource().getLineItemIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingPackageId(), putRes.getResource().getShippingPackageId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingRecipientId(), putRes.getResource().getShippingRecipientId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingAddressId(), putRes.getResource().getShippingAddressId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingRecipientAttributes(), putRes.getResource().getShippingRecipientAttributes());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingAddressAttributes(), putRes.getResource().getShippingAddressAttributes());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ShippingMethod> crudDeleteTest(ShippingMethod res, ApiCaller caller) {
	
		// DELETE
	
		DeleteChannelShippingMethodsId delOp = ApiOperations.DeleteChannelShippingMethodsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteChannelShippingMethodsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ShippingMethod> delRes = test(delReq, caller);
	
		// GET
	
		GetChannelShippingMethodsId getOp = ApiOperations.GetChannelShippingMethodsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetChannelShippingMethodsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingMethod> getRes = null;
	
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
	
		ShippingMethodTest test = new ShippingMethodTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
