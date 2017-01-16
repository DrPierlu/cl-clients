package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountOptionValuesId
 */
public class DeleteAccountOptionValuesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/option_values/{id}";


	public DeleteAccountOptionValuesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountOptionValuesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
