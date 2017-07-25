package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentPrice;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountPaymentPricesId
 */
public class DeleteAccountPaymentPricesId extends DeleteOperation<PaymentPrice> {

	public static final String OPERATION_PATH = "/account/payment_prices/{id}";


	public DeleteAccountPaymentPricesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountPaymentPricesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<PaymentPrice> getResourceType() {
		return PaymentPrice.class;
	}
	
}
