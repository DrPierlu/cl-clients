package io.commercelayer.api.operation;

import io.commercelayer.api.model.LineItem;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountLineItems
 */
public class PostAccountLineItems extends PostOperation<LineItem> {

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
	

	public Class<LineItem> getResourceType() {
		return LineItem.class;
	}
	
}
