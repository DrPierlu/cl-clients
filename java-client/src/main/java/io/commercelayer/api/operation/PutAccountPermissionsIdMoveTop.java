package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountPermissionsIdMoveTop
 */
public class PutAccountPermissionsIdMoveTop extends MoveOperation {

	public static final String OPERATION_PATH = "/account/permissions/{id}/move_top";


	public PutAccountPermissionsIdMoveTop() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPermissionsIdMoveTop(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
