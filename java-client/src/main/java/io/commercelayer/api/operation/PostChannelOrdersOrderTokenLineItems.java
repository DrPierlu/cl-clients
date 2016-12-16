package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostChannelOrdersOrderTokenLineItems
 */
public class PostChannelOrdersOrderTokenLineItems extends PostOperation {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/line_items";


	public PostChannelOrdersOrderTokenLineItems() {
		super(OPERATION_PATH);
	}
	
}
