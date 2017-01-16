package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountStockLocationsIdMoveBottom
 */
public class PutAccountStockLocationsIdMoveBottom extends MoveOperation {

	public static final String OPERATION_PATH = "/account/stock_locations/{id}/move_bottom";


	public PutAccountStockLocationsIdMoveBottom() {
		super(OPERATION_PATH);
	}
	

	public PutAccountStockLocationsIdMoveBottom(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
