package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountOptionValuesId
 */
public class PutAccountOptionValuesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/option_values/{id}";


	public PutAccountOptionValuesId() {
		super(OPERATION_PATH);
	}
	
}
