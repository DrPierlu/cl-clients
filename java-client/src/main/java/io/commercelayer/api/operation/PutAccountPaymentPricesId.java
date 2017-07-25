package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentPrice;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountPaymentPricesId
 */
public class PutAccountPaymentPricesId extends PutOperation<PaymentPrice> {

	public static final String OPERATION_PATH = "/account/payment_prices/{id}";


	{
		addRequiredField("priceListId");
		addRequiredField("paymentTypeId");
		addRequiredField("amount");
	}


	public PutAccountPaymentPricesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPaymentPricesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<PaymentPrice> getResourceType() {
		return PaymentPrice.class;
	}
	
}
