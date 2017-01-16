package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPaymentMethods
 */
public class GetAccountPaymentMethods extends SearchOperation {

	public static final String OPERATION_PATH = "/account/payment_methods";


	public GetAccountPaymentMethods() {
		super(OPERATION_PATH);
	}
	
}
