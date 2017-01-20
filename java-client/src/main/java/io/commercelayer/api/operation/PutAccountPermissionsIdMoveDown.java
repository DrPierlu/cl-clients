package io.commercelayer.api.operation;

import io.commercelayer.api.model.Permission;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountPermissionsIdMoveDown
 */
public class PutAccountPermissionsIdMoveDown extends MoveOperation<Permission> {

	public static final String OPERATION_PATH = "/account/permissions/{id}/move_down";


	public PutAccountPermissionsIdMoveDown() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPermissionsIdMoveDown(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Permission> getResourceType() {
		return Permission.class;
	}
	
}
