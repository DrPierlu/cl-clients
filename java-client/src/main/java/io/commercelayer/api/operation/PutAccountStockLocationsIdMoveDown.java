package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountStockLocationsIdMoveDown
 */
public class PutAccountStockLocationsIdMoveDown extends MoveOperation {

	public static final String OPERATION_PATH = "/account/stock_locations/{id}/move_down";


	public PutAccountStockLocationsIdMoveDown() {
		super(OPERATION_PATH);
	}
	

	public PutAccountStockLocationsIdMoveDown(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
