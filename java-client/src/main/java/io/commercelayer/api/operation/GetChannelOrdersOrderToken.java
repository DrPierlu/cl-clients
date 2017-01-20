package io.commercelayer.api.operation;

import io.commercelayer.api.model.Order;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelOrdersOrderToken
 */
public class GetChannelOrdersOrderToken extends SearchOperation<Order> {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}";


	public GetChannelOrdersOrderToken() {
		super(OPERATION_PATH);
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
