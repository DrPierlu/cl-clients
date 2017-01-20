package io.commercelayer.api.operation;

import io.commercelayer.api.model.StockItem;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountStockItems
 */
public class GetAccountStockItems extends SearchOperation {

	public static final String OPERATION_PATH = "/account/stock_items";


	public GetAccountStockItems() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return StockItem.class;
	}
	
}
