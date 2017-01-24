package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutChannelOrdersOrderTokenTaxes
 */
public class PutChannelOrdersOrderTokenTaxes extends PutOperation {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/taxes";


	{
		
	}


	public PutChannelOrdersOrderTokenTaxes() {
		super(OPERATION_PATH);
	}
	

	public PutChannelOrdersOrderTokenTaxes(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public void setOrderToken(Object orderToken) {
		addPathParam("order_token", orderToken);
	}
	

	public Object getOrderToken() {
		return getPathParam("order_token");
	}
	
}
