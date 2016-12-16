package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountStockItemsId
 */
public class PutAccountStockItemsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/stock_items/{id}";


	public PutAccountStockItemsId() {
		super(OPERATION_PATH);
	}
	
}
