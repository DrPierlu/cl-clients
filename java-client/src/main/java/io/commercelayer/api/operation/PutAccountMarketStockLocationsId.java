package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketStockLocation;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountMarketStockLocationsId
 */
public class PutAccountMarketStockLocationsId extends PutOperation<MarketStockLocation> {

	public static final String OPERATION_PATH = "/account/market_stock_locations/{id}";


	{
		addRequiredField("marketId");
		addRequiredField("stockLocationId");
		addRequiredField("id");
	}


	public PutAccountMarketStockLocationsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountMarketStockLocationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MarketStockLocation> getResourceType() {
		return MarketStockLocation.class;
	}
	
}
