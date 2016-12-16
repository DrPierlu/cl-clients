package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountPaymentTypesId
 */
public class PutAccountPaymentTypesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/payment_types/{id}";


	public PutAccountPaymentTypesId() {
		super(OPERATION_PATH);
	}
	
}
