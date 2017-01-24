package io.commercelayer.api.operation;

import io.commercelayer.api.model.Order;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutChannelOrdersOrderToken
 */
public class PutChannelOrdersOrderToken extends PutOperation<Order> {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}";


	{
		addRequiredField("customerId");
		addRequiredField("customerAttributes");
	}


	public PutChannelOrdersOrderToken() {
		super(OPERATION_PATH);
	}
	

	public PutChannelOrdersOrderToken(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public void setOrderToken(Object orderToken) {
		addPathParam("order_token", orderToken);
	}
	

	public Object getOrderToken() {
		return getPathParam("order_token");
	}
	

	public Class<Order> getResourceType() {
		return Order.class;
	}
	
}
