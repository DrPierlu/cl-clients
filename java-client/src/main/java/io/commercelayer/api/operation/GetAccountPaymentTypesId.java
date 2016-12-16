package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;

/**
 * GetAccountPaymentTypesId
 */
public class GetAccountPaymentTypesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/payment_types/{id}";


	public GetAccountPaymentTypesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountPaymentTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
