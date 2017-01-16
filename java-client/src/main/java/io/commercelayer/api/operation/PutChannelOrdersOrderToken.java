package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutChannelOrdersOrderToken
 */
public class PutChannelOrdersOrderToken extends PutOperation {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}";


	{
		addRequiredField("customerId");
		addRequiredField("customerAttributes");
		addRequiredField("orderToken");
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
	
}
