package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountPropertyTypesId
 */
public class DeleteAccountPropertyTypesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/property_types/{id}";


	public DeleteAccountPropertyTypesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountPropertyTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
