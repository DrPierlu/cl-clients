package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountLineItemStocksId
 */
public class PutAccountLineItemStocksId extends PutOperation {

	public static final String OPERATION_PATH = "/account/line_item_stocks/{id}";


	public PutAccountLineItemStocksId() {
		super(OPERATION_PATH);
	}
	
}
