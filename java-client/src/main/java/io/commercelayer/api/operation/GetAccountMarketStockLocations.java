package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketStockLocation;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountMarketStockLocations
 */
public class GetAccountMarketStockLocations extends SearchOperation {

	public static final String OPERATION_PATH = "/account/market_stock_locations";


	public GetAccountMarketStockLocations() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return MarketStockLocation.class;
	}
	
}
