package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountPaymentMethodsId
 */
public class PutAccountPaymentMethodsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/payment_methods/{id}";


	public PutAccountPaymentMethodsId() {
		super(OPERATION_PATH);
	}
	
}
