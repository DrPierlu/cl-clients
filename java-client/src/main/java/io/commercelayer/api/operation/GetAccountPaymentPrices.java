package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentPrice;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPaymentPrices
 */
public class GetAccountPaymentPrices extends SearchOperation<PaymentPrice> {

	public static final String OPERATION_PATH = "/account/payment_prices";


	public GetAccountPaymentPrices() {
		super(OPERATION_PATH);
	}
	

	public Class<PaymentPrice> getResourceType() {
		return PaymentPrice.class;
	}
	
}
