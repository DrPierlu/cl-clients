package io.commercelayer.api.operation;

import io.commercelayer.api.model.Order;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostChannelOrders
 */
public class PostChannelOrders extends PostOperation<Order> {

	public static final String OPERATION_PATH = "/channel/orders";


	{
		addRequiredField("customerId");
		addRequiredField("customerAttributes");
		addRequiredField("lineItemAttributes");
		addRequiredField("lineItemAttributes");
		addRequiredField("lineItemAttributes");
	}


	public PostChannelOrders() {
		super(OPERATION_PATH);
	}
	

	public Class<Order> getResourceType() {
		return Order.class;
	}
	
}
