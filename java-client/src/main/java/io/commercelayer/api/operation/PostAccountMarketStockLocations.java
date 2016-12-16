package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountMarketStockLocations
 */
public class PostAccountMarketStockLocations extends PostOperation {

	public static final String OPERATION_PATH = "/account/market_stock_locations";


	public PostAccountMarketStockLocations() {
		super(OPERATION_PATH);
	}
	
}
