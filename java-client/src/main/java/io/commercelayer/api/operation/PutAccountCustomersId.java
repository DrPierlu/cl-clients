package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountCustomersId
 */
public class PutAccountCustomersId extends PutOperation {

	public static final String OPERATION_PATH = "/account/customers/{id}";


	public PutAccountCustomersId() {
		super(OPERATION_PATH);
	}
	
}
