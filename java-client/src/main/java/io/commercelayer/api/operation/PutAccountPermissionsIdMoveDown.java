package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountPermissionsIdMoveDown
 */
public class PutAccountPermissionsIdMoveDown extends MoveOperation {

	public static final String OPERATION_PATH = "/account/permissions/{id}/move_down";


	public PutAccountPermissionsIdMoveDown() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPermissionsIdMoveDown(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
