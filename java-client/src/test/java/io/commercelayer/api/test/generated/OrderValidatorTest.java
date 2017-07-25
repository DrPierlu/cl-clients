package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.OrderValidator;
import io.commercelayer.api.operation.DeleteAccountOrderValidatorsId;
import io.commercelayer.api.operation.GetAccountOrderValidatorsId;
import io.commercelayer.api.operation.PostAccountOrderValidators;
import io.commercelayer.api.operation.PutAccountOrderValidatorsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * OrderValidatorTest
 */
public class OrderValidatorTest extends IntegrationTest<OrderValidator> {

	@Override
	public ApiResponse<OrderValidator> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountOrderValidators postOp = ApiOperations.PostAccountOrderValidators();
	
		OrderValidator res = new OrderValidator();
	
		// FIELD NOT FOUND -> res.setOrderTotalMax("orderTotalMax");
		// FIELD NOT FOUND -> res.setOrderItemsMax("orderItemsMax");
		// FIELD NOT FOUND -> res.setOrderTotalMin("orderTotalMin");
		// FIELD NOT FOUND -> res.setOrderItemsMin("orderItemsMin");
		// FIELD NOT FOUND -> res.setPaymentMethodAction("paymentMethodAction");
		// FIELD NOT FOUND -> res.setMarketIds("marketIds");
		// FIELD NOT FOUND -> res.setCurrencyCode("currencyCode");
		// FIELD NOT FOUND -> res.setPaymentMethodRequiredPercentage("paymentMethodRequiredPercentage");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountOrderValidators> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<OrderValidator> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getOrderTotalMax());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getOrderItemsMax());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getOrderTotalMin());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getOrderItemsMin());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPaymentMethodAction());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMarketIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCurrencyCode());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPaymentMethodRequiredPercentage());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<OrderValidator> crudReadTest(OrderValidator res, ApiCaller caller) {
	
		// GET
	
		GetAccountOrderValidatorsId getOp = ApiOperations.GetAccountOrderValidatorsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountOrderValidatorsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<OrderValidator> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<OrderValidator> crudUpdateTest(OrderValidator oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountOrderValidatorsId putOp = ApiOperations.PutAccountOrderValidatorsId();
		putOp.setId(oldRes.getId());
	
		OrderValidator res = new OrderValidator();
	
		// FIELD NOT FOUND -> res.setOrderTotalMax(randomField(oldRes.getOrderTotalMax()));
		// FIELD NOT FOUND -> res.setOrderItemsMax(randomField(oldRes.getOrderItemsMax()));
		// FIELD NOT FOUND -> res.setOrderTotalMin(randomField(oldRes.getOrderTotalMin()));
		// FIELD NOT FOUND -> res.setOrderItemsMin(randomField(oldRes.getOrderItemsMin()));
		// FIELD NOT FOUND -> res.setPaymentMethodAction(randomField(oldRes.getPaymentMethodAction()));
		// FIELD NOT FOUND -> res.setMarketIds(randomField(oldRes.getMarketIds()));
		// FIELD NOT FOUND -> res.setCurrencyCode(randomField(oldRes.getCurrencyCode()));
		// FIELD NOT FOUND -> res.setPaymentMethodRequiredPercentage(randomField(oldRes.getPaymentMethodRequiredPercentage()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountOrderValidatorsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<OrderValidator> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getOrderTotalMax(), putRes.getResource().getOrderTotalMax());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getOrderItemsMax(), putRes.getResource().getOrderItemsMax());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getOrderTotalMin(), putRes.getResource().getOrderTotalMin());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getOrderItemsMin(), putRes.getResource().getOrderItemsMin());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPaymentMethodAction(), putRes.getResource().getPaymentMethodAction());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMarketIds(), putRes.getResource().getMarketIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCurrencyCode(), putRes.getResource().getCurrencyCode());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPaymentMethodRequiredPercentage(), putRes.getResource().getPaymentMethodRequiredPercentage());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<OrderValidator> crudDeleteTest(OrderValidator res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountOrderValidatorsId delOp = ApiOperations.DeleteAccountOrderValidatorsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountOrderValidatorsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<OrderValidator> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountOrderValidatorsId getOp = ApiOperations.GetAccountOrderValidatorsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountOrderValidatorsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<OrderValidator> getRes = null;
	
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
	
		OrderValidatorTest test = new OrderValidatorTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
