package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelShippingMethodsShippingMethodIdAvailableShippingServices
 */
public class GetChannelShippingMethodsShippingMethodIdAvailableShippingServices extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/shipping_methods/{shipping_method_id}/available_shipping_services";


	public GetChannelShippingMethodsShippingMethodIdAvailableShippingServices() {
		super(OPERATION_PATH);
	}
	

	public void setShippingMethodId(Object shippingMethodId) {
		addPathParam("shipping_method_id", shippingMethodId);
	}
	

	public Object getShippingMethodId() {
		return getPathParam("shipping_method_id");
	}
	
}
