package io.commercelayer.api.operation;

import io.commercelayer.api.model.StockItem;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelMarketsCurrentStockItems
 */
public class GetChannelMarketsCurrentStockItems extends SearchOperation<StockItem> {

	public static final String OPERATION_PATH = "/channel/markets/current/stock_items";


	public GetChannelMarketsCurrentStockItems() {
		super(OPERATION_PATH);
	}
	

	public Class<StockItem> getResourceType() {
		return StockItem.class;
	}
	
}
