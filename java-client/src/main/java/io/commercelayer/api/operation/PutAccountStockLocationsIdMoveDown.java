package io.commercelayer.api.operation;

import io.commercelayer.api.model.StockLocation;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountStockLocationsIdMoveDown
 */
public class PutAccountStockLocationsIdMoveDown extends MoveOperation<StockLocation> {

	public static final String OPERATION_PATH = "/account/stock_locations/{id}/move_down";


	public PutAccountStockLocationsIdMoveDown() {
		super(OPERATION_PATH);
	}
	

	public PutAccountStockLocationsIdMoveDown(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<StockLocation> getResourceType() {
		return StockLocation.class;
	}
	
}
