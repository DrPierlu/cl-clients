package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;

/**
 * GetAccountStockItemsId
 */
public class GetAccountStockItemsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/stock_items/{id}";


	public GetAccountStockItemsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountStockItemsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
