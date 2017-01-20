package io.commercelayer.api.operation;

import io.commercelayer.api.model.StockLocation;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountStockLocationsIdMoveUp
 */
public class PutAccountStockLocationsIdMoveUp extends MoveOperation<StockLocation> {

	public static final String OPERATION_PATH = "/account/stock_locations/{id}/move_up";


	public PutAccountStockLocationsIdMoveUp() {
		super(OPERATION_PATH);
	}
	

	public PutAccountStockLocationsIdMoveUp(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<StockLocation> getResourceType() {
		return StockLocation.class;
	}
	
}
