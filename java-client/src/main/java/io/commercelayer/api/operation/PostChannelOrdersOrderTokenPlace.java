package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostChannelOrdersOrderTokenPlace
 */
public class PostChannelOrdersOrderTokenPlace extends PostOperation {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/place";


	{
		addRequiredField("orderToken");
	}

	public PostChannelOrdersOrderTokenPlace() {
		super(OPERATION_PATH);
	}
	
}
