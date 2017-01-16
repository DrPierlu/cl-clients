package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountLineItems
 */
public class PostAccountLineItems extends PostOperation {

	public static final String OPERATION_PATH = "/account/line_items";


	{
		addRequiredField("orderId");
		addRequiredField("sellableResource");
		addRequiredField("sellableId");
		addRequiredField("quantity");
	}


	public PostAccountLineItems() {
		super(OPERATION_PATH);
	}
	
}
