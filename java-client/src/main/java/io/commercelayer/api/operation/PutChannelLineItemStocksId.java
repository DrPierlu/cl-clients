package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutChannelLineItemStocksId
 */
public class PutChannelLineItemStocksId extends PutOperation {

	public static final String OPERATION_PATH = "/channel/line_item_stocks/{id}";


	public PutChannelLineItemStocksId() {
		super(OPERATION_PATH);
	}
	
}
