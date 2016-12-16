package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;

/**
 * DeleteAccountOrganizationsId
 */
public class DeleteAccountOrganizationsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/organizations/{id}";


	public DeleteAccountOrganizationsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountOrganizationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
