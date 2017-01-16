package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountPropertyValuesIdMoveTop
 */
public class PutAccountPropertyValuesIdMoveTop extends MoveOperation {

	public static final String OPERATION_PATH = "/account/property_values/{id}/move_top";


	public PutAccountPropertyValuesIdMoveTop() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPropertyValuesIdMoveTop(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
