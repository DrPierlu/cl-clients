package io.commercelayer.api.operation;

import io.commercelayer.api.model.Order;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostChannelOrders
 */
public class PostChannelOrders extends PostOperation<Order> {

	public static final String OPERATION_PATH = "/channel/orders";


	public PostChannelOrders() {
		super(OPERATION_PATH);
	}
	

	public Class<Order> getResourceType() {
		return Order.class;
	}
	
}
