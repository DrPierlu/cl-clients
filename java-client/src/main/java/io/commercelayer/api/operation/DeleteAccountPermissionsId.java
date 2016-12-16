package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;

/**
 * DeleteAccountPermissionsId
 */
public class DeleteAccountPermissionsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/permissions/{id}";


	public DeleteAccountPermissionsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountPermissionsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
