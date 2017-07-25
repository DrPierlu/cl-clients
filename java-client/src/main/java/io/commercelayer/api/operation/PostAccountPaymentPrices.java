package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentPrice;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountPaymentPrices
 */
public class PostAccountPaymentPrices extends PostOperation<PaymentPrice> {

	public static final String OPERATION_PATH = "/account/payment_prices";


	{
		addRequiredField("priceListId");
		addRequiredField("paymentTypeId");
		addRequiredField("amount");
	}


	public PostAccountPaymentPrices() {
		super(OPERATION_PATH);
	}
	

	public Class<PaymentPrice> getResourceType() {
		return PaymentPrice.class;
	}
	
}
