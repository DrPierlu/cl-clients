package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingMethod;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountShippingMethods
 */
public class GetAccountShippingMethods extends SearchOperation<ShippingMethod> {

	public static final String OPERATION_PATH = "/account/shipping_methods";


	public GetAccountShippingMethods() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingMethod> getResourceType() {
		return ShippingMethod.class;
	}
	
}
