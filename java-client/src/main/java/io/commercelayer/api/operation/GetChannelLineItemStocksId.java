package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetChannelLineItemStocksId
 */
public class GetChannelLineItemStocksId extends GetIdOperation {

	public static final String OPERATION_PATH = "/channel/line_item_stocks/{id}";


	public GetChannelLineItemStocksId() {
		super(OPERATION_PATH);
	}
	

	public GetChannelLineItemStocksId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
