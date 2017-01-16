package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPaymentTypes
 */
public class GetAccountPaymentTypes extends SearchOperation {

	public static final String OPERATION_PATH = "/account/payment_types";


	public GetAccountPaymentTypes() {
		super(OPERATION_PATH);
	}
	
}
