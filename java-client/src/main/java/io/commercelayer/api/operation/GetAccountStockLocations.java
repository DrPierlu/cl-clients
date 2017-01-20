package io.commercelayer.api.operation;

import io.commercelayer.api.model.StockLocation;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountStockLocations
 */
public class GetAccountStockLocations extends SearchOperation {

	public static final String OPERATION_PATH = "/account/stock_locations";


	public GetAccountStockLocations() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return StockLocation.class;
	}
	
}
