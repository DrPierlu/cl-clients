package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentPrice;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountPaymentPricesId
 */
public class GetAccountPaymentPricesId extends GetIdOperation<PaymentPrice> {

	public static final String OPERATION_PATH = "/account/payment_prices/{id}";


	public GetAccountPaymentPricesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountPaymentPricesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<PaymentPrice> getResourceType() {
		return PaymentPrice.class;
	}
	
}
