package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountPaymentTypesId
 */
public class DeleteAccountPaymentTypesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/payment_types/{id}";


	public DeleteAccountPaymentTypesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountPaymentTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
