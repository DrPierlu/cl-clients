package io.commercelayer.api.operation;

import io.commercelayer.api.model.LineItemStock;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountLineItemStocksId
 */
public class PutAccountLineItemStocksId extends PutOperation<LineItemStock> {

	public static final String OPERATION_PATH = "/account/line_item_stocks/{id}";


	{
		addRequiredField("lineItemId");
		addRequiredField("stockItemId");
		addRequiredField("quantity");
		addRequiredField("shippingMethodId");
		addRequiredField("shipmentId");
	}


	public PutAccountLineItemStocksId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountLineItemStocksId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<LineItemStock> getResourceType() {
		return LineItemStock.class;
	}
	
}
