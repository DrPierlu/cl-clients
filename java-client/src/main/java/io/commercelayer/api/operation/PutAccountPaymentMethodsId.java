package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentMethod;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountPaymentMethodsId
 */
public class PutAccountPaymentMethodsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/payment_methods/{id}";


	{
		addRequiredField("orderId");
		addRequiredField("paymentSourceResource");
		addRequiredField("paymentSourceId");
		addRequiredField("billingAddressId");
		addRequiredField("amount");
		addRequiredField("id");
	}


	public PutAccountPaymentMethodsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPaymentMethodsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PaymentMethod.class;
	}
	
}
