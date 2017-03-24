package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentMethod;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountPaymentMethodsId
 */
public class PutAccountPaymentMethodsId extends PutOperation<PaymentMethod> {

	public static final String OPERATION_PATH = "/account/payment_methods/{id}";


	{
		addRequiredField("orderId");
		addRequiredField("paymentSourceResource");
		addRequiredField("paymentSourceId");
		addRequiredField("billingRecipientId");
		addRequiredField("billingAddressId");
		addRequiredField("amount");
	}


	public PutAccountPaymentMethodsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPaymentMethodsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<PaymentMethod> getResourceType() {
		return PaymentMethod.class;
	}
	
}
