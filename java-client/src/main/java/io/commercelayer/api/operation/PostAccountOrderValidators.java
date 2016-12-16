package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountOrderValidators
 */
public class PostAccountOrderValidators extends PostOperation {

	public static final String OPERATION_PATH = "/account/order_validators";


	public PostAccountOrderValidators() {
		super(OPERATION_PATH);
	}
	
}
