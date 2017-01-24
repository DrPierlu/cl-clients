package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PaymentMethod;
import io.commercelayer.api.operation.DeleteChannelPaymentMethodsId;
import io.commercelayer.api.operation.GetChannelPaymentMethodsId;
import io.commercelayer.api.operation.PostChannelOrdersOrderTokenPaymentMethods;
import io.commercelayer.api.operation.PutChannelPaymentMethodsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * PaymentMethodTest
 */
public class PaymentMethodTest extends IntegrationTest<PaymentMethod> {

	@Override
	public ApiResponse<PaymentMethod> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostChannelOrdersOrderTokenPaymentMethods postOp = ApiOperations.PostChannelOrdersOrderTokenPaymentMethods();
	
		PaymentMethod res = new PaymentMethod();
	
		// FIELD NOT FOUND -> res.setPaymentSourceResource("paymentSourceResource");
		res.setAmount("amount");
		// FIELD NOT FOUND -> res.setPaymentSourceId("paymentSourceId");
		// FIELD NOT FOUND -> res.setBillingAddressId("billingAddressId");
		// FIELD NOT FOUND -> res.setBillingAddressAttributes("billingAddressAttributes");
		// FIELD NOT FOUND -> res.setPaymentSourceAttributes("paymentSourceAttributes");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostChannelOrdersOrderTokenPaymentMethods> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<PaymentMethod> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPaymentSourceResource());
		Assert.assertNotNull(postRes.getResource().getAmount());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPaymentSourceId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getBillingAddressId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getBillingAddressAttributes());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPaymentSourceAttributes());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<PaymentMethod> crudReadTest(PaymentMethod res, ApiCaller caller) {
	
		// GET
	
		GetChannelPaymentMethodsId getOp = ApiOperations.GetChannelPaymentMethodsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetChannelPaymentMethodsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<PaymentMethod> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<PaymentMethod> crudUpdateTest(PaymentMethod oldRes, ApiCaller caller) {
	
		// PUT
	
		PutChannelPaymentMethodsId putOp = ApiOperations.PutChannelPaymentMethodsId();
		putOp.setId(oldRes.getId());
	
		PaymentMethod res = new PaymentMethod();
	
		// FIELD NOT FOUND -> res.setPaymentSourceResource(randomField(oldRes.getPaymentSourceResource()));
		res.setAmount(randomField(oldRes.getAmount()));
		// FIELD NOT FOUND -> res.setPaymentSourceId(randomField(oldRes.getPaymentSourceId()));
		// FIELD NOT FOUND -> res.setBillingAddressId(randomField(oldRes.getBillingAddressId()));
		// FIELD NOT FOUND -> res.setBillingAddressAttributes(randomField(oldRes.getBillingAddressAttributes()));
		// FIELD NOT FOUND -> res.setPaymentSourceAttributes(randomField(oldRes.getPaymentSourceAttributes()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutChannelPaymentMethodsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<PaymentMethod> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPaymentSourceResource(), putRes.getResource().getPaymentSourceResource());
		Assert.assertNotEquals(oldRes.getAmount(), putRes.getResource().getAmount());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPaymentSourceId(), putRes.getResource().getPaymentSourceId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getBillingAddressId(), putRes.getResource().getBillingAddressId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getBillingAddressAttributes(), putRes.getResource().getBillingAddressAttributes());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPaymentSourceAttributes(), putRes.getResource().getPaymentSourceAttributes());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<PaymentMethod> crudDeleteTest(PaymentMethod res, ApiCaller caller) {
	
		// DELETE
	
		DeleteChannelPaymentMethodsId delOp = ApiOperations.DeleteChannelPaymentMethodsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteChannelPaymentMethodsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<PaymentMethod> delRes = test(delReq, caller);
	
		// GET
	
		GetChannelPaymentMethodsId getOp = ApiOperations.GetChannelPaymentMethodsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetChannelPaymentMethodsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<PaymentMethod> getRes = null;
	
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
	
		PaymentMethodTest test = new PaymentMethodTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
