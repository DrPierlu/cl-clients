package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteChannelPaymentMethodsId
 */
public class DeleteChannelPaymentMethodsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/channel/payment_methods/{id}";


	public DeleteChannelPaymentMethodsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteChannelPaymentMethodsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
