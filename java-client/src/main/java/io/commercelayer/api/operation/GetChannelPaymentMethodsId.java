package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;

/**
 * GetChannelPaymentMethodsId
 */
public class GetChannelPaymentMethodsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/channel/payment_methods/{id}";


	public GetChannelPaymentMethodsId() {
		super(OPERATION_PATH);
	}
	

	public GetChannelPaymentMethodsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
