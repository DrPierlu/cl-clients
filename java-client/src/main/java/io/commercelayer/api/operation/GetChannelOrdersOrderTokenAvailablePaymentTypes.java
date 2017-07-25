package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelOrdersOrderTokenAvailablePaymentTypes
 */
public class GetChannelOrdersOrderTokenAvailablePaymentTypes extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/available_payment_types";


	public GetChannelOrdersOrderTokenAvailablePaymentTypes() {
		super(OPERATION_PATH);
	}
	

	public void setOrderToken(Object orderToken) {
		addPathParam("order_token", orderToken);
	}
	

	public Object getOrderToken() {
		return getPathParam("order_token");
	}
	
}
