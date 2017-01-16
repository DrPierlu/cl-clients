package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutChannelOrdersOrderTokenPlace
 */
public class PutChannelOrdersOrderTokenPlace extends PutOperation {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/place";


	{
		addRequiredField("orderToken");
	}


	public PutChannelOrdersOrderTokenPlace() {
		super(OPERATION_PATH);
	}
	

	public PutChannelOrdersOrderTokenPlace(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public void setOrderToken(Object orderToken) {
		addPathParam("order_token", orderToken);
	}
	

	public Object getOrderToken() {
		return getPathParam("order_token");
	}
	
}
