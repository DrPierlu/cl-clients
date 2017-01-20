package io.commercelayer.api.operation;

import io.commercelayer.api.model.StockLocation;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountStockLocationsId
 */
public class DeleteAccountStockLocationsId extends DeleteOperation<StockLocation> {

	public static final String OPERATION_PATH = "/account/stock_locations/{id}";


	public DeleteAccountStockLocationsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountStockLocationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<StockLocation> getResourceType() {
		return StockLocation.class;
	}
	
}
