package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingMethod;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostChannelOrdersOrderTokenShippingMethods
 */
public class PostChannelOrdersOrderTokenShippingMethods extends PostOperation<ShippingMethod> {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/shipping_methods";


	{
		addRequiredField("shippingServiceId");
		addRequiredField("shippingPackageId");
		addRequiredField("shippingAddressAttributes");
		addRequiredField("shippingAddressId");
	}


	public PostChannelOrdersOrderTokenShippingMethods() {
		super(OPERATION_PATH);
	}
	

	public void setOrderToken(Object orderToken) {
		addPathParam("order_token", orderToken);
	}
	

	public Object getOrderToken() {
		return getPathParam("order_token");
	}
	

	public Class<ShippingMethod> getResourceType() {
		return ShippingMethod.class;
	}
	
}
