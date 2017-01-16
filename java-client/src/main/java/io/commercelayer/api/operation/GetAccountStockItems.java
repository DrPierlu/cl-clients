package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountStockItems
 */
public class GetAccountStockItems extends SearchOperation {

	public static final String OPERATION_PATH = "/account/stock_items";


	public GetAccountStockItems() {
		super(OPERATION_PATH);
	}
	
}
