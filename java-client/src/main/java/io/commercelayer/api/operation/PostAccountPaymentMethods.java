package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountPaymentMethods
 */
public class PostAccountPaymentMethods extends PostOperation {

	public static final String OPERATION_PATH = "/account/payment_methods";


	public PostAccountPaymentMethods() {
		super(OPERATION_PATH);
	}
	
}
