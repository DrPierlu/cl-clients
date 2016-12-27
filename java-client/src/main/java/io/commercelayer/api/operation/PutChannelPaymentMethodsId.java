package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutChannelPaymentMethodsId
 */
public class PutChannelPaymentMethodsId extends PutOperation {

	public static final String OPERATION_PATH = "/channel/payment_methods/{id}";


	{
		addRequiredField("amount");
		addRequiredField("paymentSourceResource");
		addRequiredField("paymentSourceAttributes");
		addRequiredField("paymentSourceId");
		addRequiredField("billingAddressAttributes");
		addRequiredField("billingAddressId");
		addRequiredField("id");
	}

	public PutChannelPaymentMethodsId() {
		super(OPERATION_PATH);
	}
	

	public PutChannelPaymentMethodsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}