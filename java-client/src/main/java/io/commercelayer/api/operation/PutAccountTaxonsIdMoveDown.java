package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountTaxonsIdMoveDown
 */
public class PutAccountTaxonsIdMoveDown extends MoveOperation {

	public static final String OPERATION_PATH = "/account/taxons/{id}/move_down";


	public PutAccountTaxonsIdMoveDown() {
		super(OPERATION_PATH);
	}
	

	public PutAccountTaxonsIdMoveDown(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
