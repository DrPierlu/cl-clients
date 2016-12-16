package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountMarketStockLocationsId
 */
public class PutAccountMarketStockLocationsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/market_stock_locations/{id}";


	public PutAccountMarketStockLocationsId() {
		super(OPERATION_PATH);
	}
	
}
