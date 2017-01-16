package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountStockItems
 */
public class PostAccountStockItems extends PostOperation {

	public static final String OPERATION_PATH = "/account/stock_items";


	{
		addRequiredField("stockLocationId");
		addRequiredField("stockableResource");
		addRequiredField("stockableId");
		addRequiredField("quantity");
	}


	public PostAccountStockItems() {
		super(OPERATION_PATH);
	}
	
}
