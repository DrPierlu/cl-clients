package io.commercelayer.api.operation;

import io.commercelayer.api.model.StockLocation;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountStockLocations
 */
public class GetAccountStockLocations extends SearchOperation<StockLocation> {

	public static final String OPERATION_PATH = "/account/stock_locations";


	public GetAccountStockLocations() {
		super(OPERATION_PATH);
	}
	

	public Class<StockLocation> getResourceType() {
		return StockLocation.class;
	}
	
}
