package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountOptionValuesIdMoveUp
 */
public class PutAccountOptionValuesIdMoveUp extends MoveOperation {

	public static final String OPERATION_PATH = "/account/option_values/{id}/move_up";


	public PutAccountOptionValuesIdMoveUp() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOptionValuesIdMoveUp(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
