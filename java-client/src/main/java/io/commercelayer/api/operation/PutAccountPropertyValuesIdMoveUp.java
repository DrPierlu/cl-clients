package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountPropertyValuesIdMoveUp
 */
public class PutAccountPropertyValuesIdMoveUp extends MoveOperation {

	public static final String OPERATION_PATH = "/account/property_values/{id}/move_up";


	public PutAccountPropertyValuesIdMoveUp() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPropertyValuesIdMoveUp(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
