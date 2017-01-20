package io.commercelayer.api.operation;

import io.commercelayer.api.model.Permission;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountPermissionsId
 */
public class DeleteAccountPermissionsId extends DeleteOperation<Permission> {

	public static final String OPERATION_PATH = "/account/permissions/{id}";


	public DeleteAccountPermissionsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountPermissionsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Permission> getResourceType() {
		return Permission.class;
	}
	
}
