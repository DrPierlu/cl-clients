package io.commercelayer.api.operation;

import io.commercelayer.api.model.LineItemStock;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutChannelLineItemStocksId
 */
public class PutChannelLineItemStocksId extends PutOperation<LineItemStock> {

	public static final String OPERATION_PATH = "/channel/line_item_stocks/{id}";


	{
		addRequiredField("shippingMethodId");
		addRequiredField("shippingMethodAttributes");
	}


	public PutChannelLineItemStocksId() {
		super(OPERATION_PATH);
	}
	

	public PutChannelLineItemStocksId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<LineItemStock> getResourceType() {
		return LineItemStock.class;
	}
	
}
