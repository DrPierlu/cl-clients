package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostChannelOrdersOrderTokenShippingMethods
 */
public class PostChannelOrdersOrderTokenShippingMethods extends PostOperation {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/shipping_methods";


	{
		addRequiredField("shippingServiceId");
		addRequiredField("shippingPackageId");
		addRequiredField("shippingAddressAttributes");
		addRequiredField("shippingAddressId");
		addRequiredField("orderToken");
	}

	public PostChannelOrdersOrderTokenShippingMethods() {
		super(OPERATION_PATH);
	}
	
}
