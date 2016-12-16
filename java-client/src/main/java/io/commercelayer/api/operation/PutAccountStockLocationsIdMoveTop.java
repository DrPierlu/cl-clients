package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;

/**
 * PutAccountStockLocationsIdMoveTop
 */
public class PutAccountStockLocationsIdMoveTop extends MoveOperation {

	public static final String OPERATION_PATH = "/account/stock_locations/{id}/move_top";


	public PutAccountStockLocationsIdMoveTop() {
		super(OPERATION_PATH);
	}
	

	public PutAccountStockLocationsIdMoveTop(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
