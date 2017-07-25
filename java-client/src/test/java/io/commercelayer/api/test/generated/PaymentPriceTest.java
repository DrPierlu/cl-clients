package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PaymentPrice;
import io.commercelayer.api.operation.DeleteAccountPaymentPricesId;
import io.commercelayer.api.operation.GetAccountPaymentPricesId;
import io.commercelayer.api.operation.PostAccountPaymentPrices;
import io.commercelayer.api.operation.PutAccountPaymentPricesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * PaymentPriceTest
 */
public class PaymentPriceTest extends IntegrationTest<PaymentPrice> {

	@Override
	public ApiResponse<PaymentPrice> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountPaymentPrices postOp = ApiOperations.PostAccountPaymentPrices();
	
		PaymentPrice res = new PaymentPrice();
	
		res.setAmount("amount");
		// FIELD NOT FOUND -> res.setPaymentTypeId("paymentTypeId");
		// FIELD NOT FOUND -> res.setPriceListId("priceListId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountPaymentPrices> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<PaymentPrice> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getAmount());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPaymentTypeId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPriceListId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<PaymentPrice> crudReadTest(PaymentPrice res, ApiCaller caller) {
	
		// GET
	
		GetAccountPaymentPricesId getOp = ApiOperations.GetAccountPaymentPricesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountPaymentPricesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<PaymentPrice> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<PaymentPrice> crudUpdateTest(PaymentPrice oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountPaymentPricesId putOp = ApiOperations.PutAccountPaymentPricesId();
		putOp.setId(oldRes.getId());
	
		PaymentPrice res = new PaymentPrice();
	
		res.setAmount(randomField(oldRes.getAmount()));
		// FIELD NOT FOUND -> res.setPaymentTypeId(randomField(oldRes.getPaymentTypeId()));
		// FIELD NOT FOUND -> res.setPriceListId(randomField(oldRes.getPriceListId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountPaymentPricesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<PaymentPrice> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getAmount(), putRes.getResource().getAmount());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPaymentTypeId(), putRes.getResource().getPaymentTypeId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPriceListId(), putRes.getResource().getPriceListId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<PaymentPrice> crudDeleteTest(PaymentPrice res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountPaymentPricesId delOp = ApiOperations.DeleteAccountPaymentPricesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountPaymentPricesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<PaymentPrice> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountPaymentPricesId getOp = ApiOperations.GetAccountPaymentPricesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountPaymentPricesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<PaymentPrice> getRes = null;
	
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
	
		PaymentPriceTest test = new PaymentPriceTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
