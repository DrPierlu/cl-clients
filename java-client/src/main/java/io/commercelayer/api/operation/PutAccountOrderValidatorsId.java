package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountOrderValidatorsId
 */
public class PutAccountOrderValidatorsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/order_validators/{id}";


	public PutAccountOrderValidatorsId() {
		super(OPERATION_PATH);
	}
	
}
