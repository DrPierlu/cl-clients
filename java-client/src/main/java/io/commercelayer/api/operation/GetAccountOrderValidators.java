package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountOrderValidators
 */
public class GetAccountOrderValidators extends SearchOperation {

	public static final String OPERATION_PATH = "/account/order_validators";


	public GetAccountOrderValidators() {
		super(OPERATION_PATH);
	}
	
}
