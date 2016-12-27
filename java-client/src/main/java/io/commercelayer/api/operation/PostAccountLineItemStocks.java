package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountLineItemStocks
 */
public class PostAccountLineItemStocks extends PostOperation {

	public static final String OPERATION_PATH = "/account/line_item_stocks";


	{
		addRequiredField("lineItemId");
		addRequiredField("stockItemId");
		addRequiredField("quantity");
		addRequiredField("shippingMethodId");
		addRequiredField("shipmentId");
	}

	public PostAccountLineItemStocks() {
		super(OPERATION_PATH);
	}
	
}