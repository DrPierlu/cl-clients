package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PaymentType;
import io.commercelayer.api.operation.DeleteAccountPaymentTypesId;
import io.commercelayer.api.operation.GetAccountPaymentTypesId;
import io.commercelayer.api.operation.PostAccountPaymentTypes;
import io.commercelayer.api.operation.PutAccountPaymentTypesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * PaymentTypeTest
 */
public class PaymentTypeTest extends IntegrationTest<PaymentType> {

	@Override
	public ApiResponse<PaymentType> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountPaymentTypes postOp = ApiOperations.PostAccountPaymentTypes();
	
		PaymentType res = new PaymentType();
	
		// FIELD NOT FOUND -> res.setMerchantId("merchantId");
		// FIELD NOT FOUND -> res.setPaymentMethodIds("paymentMethodIds");
		res.setName("name");
		// FIELD NOT FOUND -> res.setResourceImageIds("resourceImageIds");
		res.setDescription("description");
		// FIELD NOT FOUND -> res.setMarketIds("marketIds");
		// FIELD NOT FOUND -> res.setPaymentPriceIds("paymentPriceIds");
		// FIELD NOT FOUND -> res.setGatewayId("gatewayId");
		// FIELD NOT FOUND -> res.setImageIds("imageIds");
		// FIELD NOT FOUND -> res.setMarketPaymentTypeIds("marketPaymentTypeIds");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountPaymentTypes> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<PaymentType> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMerchantId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPaymentMethodIds());
		Assert.assertNotNull(postRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getResourceImageIds());
		Assert.assertNotNull(postRes.getResource().getDescription());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMarketIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPaymentPriceIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getGatewayId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getImageIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMarketPaymentTypeIds());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<PaymentType> crudReadTest(PaymentType res, ApiCaller caller) {
	
		// GET
	
		GetAccountPaymentTypesId getOp = ApiOperations.GetAccountPaymentTypesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountPaymentTypesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<PaymentType> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<PaymentType> crudUpdateTest(PaymentType oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountPaymentTypesId putOp = ApiOperations.PutAccountPaymentTypesId();
		putOp.setId(oldRes.getId());
	
		PaymentType res = new PaymentType();
	
		// FIELD NOT FOUND -> res.setMerchantId(randomField(oldRes.getMerchantId()));
		// FIELD NOT FOUND -> res.setPaymentMethodIds(randomField(oldRes.getPaymentMethodIds()));
		res.setName(randomField(oldRes.getName()));
		// FIELD NOT FOUND -> res.setResourceImageIds(randomField(oldRes.getResourceImageIds()));
		res.setDescription(randomField(oldRes.getDescription()));
		// FIELD NOT FOUND -> res.setMarketIds(randomField(oldRes.getMarketIds()));
		// FIELD NOT FOUND -> res.setPaymentPriceIds(randomField(oldRes.getPaymentPriceIds()));
		// FIELD NOT FOUND -> res.setGatewayId(randomField(oldRes.getGatewayId()));
		// FIELD NOT FOUND -> res.setImageIds(randomField(oldRes.getImageIds()));
		// FIELD NOT FOUND -> res.setMarketPaymentTypeIds(randomField(oldRes.getMarketPaymentTypeIds()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountPaymentTypesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<PaymentType> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMerchantId(), putRes.getResource().getMerchantId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPaymentMethodIds(), putRes.getResource().getPaymentMethodIds());
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getResourceImageIds(), putRes.getResource().getResourceImageIds());
		Assert.assertNotEquals(oldRes.getDescription(), putRes.getResource().getDescription());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMarketIds(), putRes.getResource().getMarketIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPaymentPriceIds(), putRes.getResource().getPaymentPriceIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getGatewayId(), putRes.getResource().getGatewayId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getImageIds(), putRes.getResource().getImageIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMarketPaymentTypeIds(), putRes.getResource().getMarketPaymentTypeIds());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<PaymentType> crudDeleteTest(PaymentType res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountPaymentTypesId delOp = ApiOperations.DeleteAccountPaymentTypesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountPaymentTypesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<PaymentType> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountPaymentTypesId getOp = ApiOperations.GetAccountPaymentTypesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountPaymentTypesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<PaymentType> getRes = null;
	
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
	
		PaymentTypeTest test = new PaymentTypeTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
