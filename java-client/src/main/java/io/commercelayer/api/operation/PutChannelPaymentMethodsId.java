package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutChannelPaymentMethodsId
 */
public class PutChannelPaymentMethodsId extends PutOperation {

	public static final String OPERATION_PATH = "/channel/payment_methods/{id}";


	public PutChannelPaymentMethodsId() {
		super(OPERATION_PATH);
	}
	
}
