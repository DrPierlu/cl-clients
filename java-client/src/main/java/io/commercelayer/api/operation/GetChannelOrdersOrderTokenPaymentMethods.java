package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentMethod;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelOrdersOrderTokenPaymentMethods
 */
public class GetChannelOrdersOrderTokenPaymentMethods extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/payment_methods";


	public GetChannelOrdersOrderTokenPaymentMethods() {
		super(OPERATION_PATH);
	}
	

	public void setOrderToken(Object orderToken) {
		addPathParam("order_token", orderToken);
	}
	

	public Object getOrderToken() {
		return getPathParam("order_token");
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PaymentMethod.class;
	}
	
}
