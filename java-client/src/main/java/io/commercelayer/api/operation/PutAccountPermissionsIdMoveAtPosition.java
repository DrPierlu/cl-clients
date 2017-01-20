package io.commercelayer.api.operation;

import io.commercelayer.api.model.Permission;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountPermissionsIdMoveAtPosition
 */
public class PutAccountPermissionsIdMoveAtPosition extends MoveOperation<Permission> {

	public static final String OPERATION_PATH = "/account/permissions/{id}/move_at/{position}";


	public PutAccountPermissionsIdMoveAtPosition() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPermissionsIdMoveAtPosition(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Permission> getResourceType() {
		return Permission.class;
	}
	
}
