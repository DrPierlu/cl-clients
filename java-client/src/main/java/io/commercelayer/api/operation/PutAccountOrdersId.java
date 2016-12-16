package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountOrdersId
 */
public class PutAccountOrdersId extends PutOperation {

	public static final String OPERATION_PATH = "/account/orders/{id}";


	public PutAccountOrdersId() {
		super(OPERATION_PATH);
	}
	
}
