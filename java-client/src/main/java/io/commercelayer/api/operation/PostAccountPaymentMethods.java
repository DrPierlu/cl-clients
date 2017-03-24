package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentMethod;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountPaymentMethods
 */
public class PostAccountPaymentMethods extends PostOperation<PaymentMethod> {

	public static final String OPERATION_PATH = "/account/payment_methods";


	{
		addRequiredField("orderId");
		addRequiredField("paymentSourceResource");
		addRequiredField("paymentSourceId");
		addRequiredField("billingRecipientId");
		addRequiredField("billingAddressId");
		addRequiredField("amount");
	}


	public PostAccountPaymentMethods() {
		super(OPERATION_PATH);
	}
	

	public Class<PaymentMethod> getResourceType() {
		return PaymentMethod.class;
	}
	
}
