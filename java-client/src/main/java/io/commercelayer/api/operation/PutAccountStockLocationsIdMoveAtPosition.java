package io.commercelayer.api.operation;

import io.commercelayer.api.model.StockLocation;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountStockLocationsIdMoveAtPosition
 */
public class PutAccountStockLocationsIdMoveAtPosition extends MoveOperation<StockLocation> {

	public static final String OPERATION_PATH = "/account/stock_locations/{id}/move_at/{position}";


	public PutAccountStockLocationsIdMoveAtPosition() {
		super(OPERATION_PATH);
	}
	

	public PutAccountStockLocationsIdMoveAtPosition(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<StockLocation> getResourceType() {
		return StockLocation.class;
	}
	
}
