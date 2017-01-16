package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutChannelOrdersOrderTokenTaxRates
 */
public class PutChannelOrdersOrderTokenTaxRates extends PutOperation {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/tax_rates";


	{
		addRequiredField("orderToken");
	}


	public PutChannelOrdersOrderTokenTaxRates() {
		super(OPERATION_PATH);
	}
	

	public PutChannelOrdersOrderTokenTaxRates(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public void setOrderToken(Object orderToken) {
		addPathParam("order_token", orderToken);
	}
	

	public Object getOrderToken() {
		return getPathParam("order_token");
	}
	
}
