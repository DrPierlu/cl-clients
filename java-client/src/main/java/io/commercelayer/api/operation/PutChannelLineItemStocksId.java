package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutChannelLineItemStocksId
 */
public class PutChannelLineItemStocksId extends PutOperation {

	public static final String OPERATION_PATH = "/channel/line_item_stocks/{id}";


	{
		addRequiredField("shippingMethodId");
		addRequiredField("shippingMethodAttributes");
		addRequiredField("id");
	}

	public PutChannelLineItemStocksId() {
		super(OPERATION_PATH);
	}
	

	public PutChannelLineItemStocksId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
