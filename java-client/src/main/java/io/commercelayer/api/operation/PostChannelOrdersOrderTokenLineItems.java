package io.commercelayer.api.operation;

import io.commercelayer.api.model.LineItem;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostChannelOrdersOrderTokenLineItems
 */
public class PostChannelOrdersOrderTokenLineItems extends PostOperation<LineItem> {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/line_items";


	{
		addRequiredField("sellableResource");
		addRequiredField("sellableId");
		addRequiredField("quantity");
	}


	public PostChannelOrdersOrderTokenLineItems() {
		super(OPERATION_PATH);
	}
	

	public void setOrderToken(Object orderToken) {
		addPathParam("order_token", orderToken);
	}
	

	public Object getOrderToken() {
		return getPathParam("order_token");
	}
	

	public Class<LineItem> getResourceType() {
		return LineItem.class;
	}
	
}
