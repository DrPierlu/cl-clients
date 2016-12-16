package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetChannelOrdersOrderTokenPaymentMethods
 */
public class GetChannelOrdersOrderTokenPaymentMethods extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/payment_methods";


	public GetChannelOrdersOrderTokenPaymentMethods() {
		super(OPERATION_PATH);
	}
	
}
