package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutChannelOrdersOrderTokenValidate
 */
public class PutChannelOrdersOrderTokenValidate extends PutOperation {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/validate";


	{
		
	}


	public PutChannelOrdersOrderTokenValidate() {
		super(OPERATION_PATH);
	}
	

	public PutChannelOrdersOrderTokenValidate(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public void setOrderToken(Object orderToken) {
		addPathParam("order_token", orderToken);
	}
	

	public Object getOrderToken() {
		return getPathParam("order_token");
	}
	
}
