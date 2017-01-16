package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountPropertyValuesIdMoveBottom
 */
public class PutAccountPropertyValuesIdMoveBottom extends MoveOperation {

	public static final String OPERATION_PATH = "/account/property_values/{id}/move_bottom";


	public PutAccountPropertyValuesIdMoveBottom() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPropertyValuesIdMoveBottom(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
