package io.commercelayer.api.operation;

import io.commercelayer.api.model.Role;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountRolesId
 */
public class DeleteAccountRolesId extends DeleteOperation<Role> {

	public static final String OPERATION_PATH = "/account/roles/{id}";


	public DeleteAccountRolesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountRolesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Role> getResourceType() {
		return Role.class;
	}
	
}
