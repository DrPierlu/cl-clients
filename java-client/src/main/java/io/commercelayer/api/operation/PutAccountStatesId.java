package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountStatesId
 */
public class PutAccountStatesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/states/{id}";


	public PutAccountStatesId() {
		super(OPERATION_PATH);
	}
	
}
