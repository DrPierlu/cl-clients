package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelOrdersOrderToken
 */
public class GetChannelOrdersOrderToken extends SearchOperation {

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
	
}
