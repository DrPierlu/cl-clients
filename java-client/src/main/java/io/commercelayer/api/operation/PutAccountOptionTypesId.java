package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountOptionTypesId
 */
public class PutAccountOptionTypesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/option_types/{id}";


	public PutAccountOptionTypesId() {
		super(OPERATION_PATH);
	}
	
}
