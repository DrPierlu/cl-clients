package io.commercelayer.api.operation;

import io.commercelayer.api.model.Permission;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountPermissionsIdMoveBottom
 */
public class PutAccountPermissionsIdMoveBottom extends MoveOperation<Permission> {

	public static final String OPERATION_PATH = "/account/permissions/{id}/move_bottom";


	public PutAccountPermissionsIdMoveBottom() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPermissionsIdMoveBottom(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Permission> getResourceType() {
		return Permission.class;
	}
	
}
