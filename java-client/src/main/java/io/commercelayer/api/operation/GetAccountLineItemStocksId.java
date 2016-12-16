package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;

/**
 * GetAccountLineItemStocksId
 */
public class GetAccountLineItemStocksId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/line_item_stocks/{id}";


	public GetAccountLineItemStocksId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountLineItemStocksId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
