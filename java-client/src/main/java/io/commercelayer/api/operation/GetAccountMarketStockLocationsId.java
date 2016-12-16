package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;

/**
 * GetAccountMarketStockLocationsId
 */
public class GetAccountMarketStockLocationsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/market_stock_locations/{id}";


	public GetAccountMarketStockLocationsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountMarketStockLocationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
