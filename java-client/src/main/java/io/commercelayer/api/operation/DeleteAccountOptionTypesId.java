package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountOptionTypesId
 */
public class DeleteAccountOptionTypesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/option_types/{id}";


	public DeleteAccountOptionTypesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountOptionTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
