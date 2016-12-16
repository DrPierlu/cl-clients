package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountStockItems
 */
public class PostAccountStockItems extends PostOperation {

	public static final String OPERATION_PATH = "/account/stock_items";


	public PostAccountStockItems() {
		super(OPERATION_PATH);
	}
	
}
