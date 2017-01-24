package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentMethod;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostChannelOrdersOrderTokenPaymentMethods
 */
public class PostChannelOrdersOrderTokenPaymentMethods extends PostOperation<PaymentMethod> {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/payment_methods";


	{
		addRequiredField("amount");
		addRequiredField("paymentSourceResource");
		addRequiredField("paymentSourceAttributes");
		addRequiredField("paymentSourceId");
		addRequiredField("billingAddressAttributes");
		addRequiredField("billingAddressId");
	}


	public PostChannelOrdersOrderTokenPaymentMethods() {
		super(OPERATION_PATH);
	}
	

	public void setOrderToken(Object orderToken) {
		addPathParam("order_token", orderToken);
	}
	

	public Object getOrderToken() {
		return getPathParam("order_token");
	}
	

	public Class<PaymentMethod> getResourceType() {
		return PaymentMethod.class;
	}
	
}
