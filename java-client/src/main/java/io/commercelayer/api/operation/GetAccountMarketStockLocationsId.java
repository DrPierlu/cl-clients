package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketStockLocation;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountMarketStockLocationsId
 */
public class GetAccountMarketStockLocationsId extends GetIdOperation<MarketStockLocation> {

	public static final String OPERATION_PATH = "/account/market_stock_locations/{id}";


	public GetAccountMarketStockLocationsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountMarketStockLocationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MarketStockLocation> getResourceType() {
		return MarketStockLocation.class;
	}
	
}
