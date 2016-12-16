package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;

/**
 * DeleteAccountRolesId
 */
public class DeleteAccountRolesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/roles/{id}";


	public DeleteAccountRolesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountRolesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
