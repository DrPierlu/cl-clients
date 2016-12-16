package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostChannelOrdersOrderTokenPaymentMethods
 */
public class PostChannelOrdersOrderTokenPaymentMethods extends PostOperation {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/payment_methods";


	public PostChannelOrdersOrderTokenPaymentMethods() {
		super(OPERATION_PATH);
	}
	
}
