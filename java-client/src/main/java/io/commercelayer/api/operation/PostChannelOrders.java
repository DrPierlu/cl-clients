package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostChannelOrders
 */
public class PostChannelOrders extends PostOperation {

	public static final String OPERATION_PATH = "/channel/orders";


	public PostChannelOrders() {
		super(OPERATION_PATH);
	}
	
}
