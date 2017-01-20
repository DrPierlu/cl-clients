package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketStockLocation;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountMarketStockLocations
 */
public class PostAccountMarketStockLocations extends PostOperation {

	public static final String OPERATION_PATH = "/account/market_stock_locations";


	{
		addRequiredField("marketId");
		addRequiredField("stockLocationId");
	}


	public PostAccountMarketStockLocations() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return MarketStockLocation.class;
	}
	
}
