package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingMethod;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingMethodsId
 */
public class GetAccountShippingMethodsId extends GetIdOperation<ShippingMethod> {

	public static final String OPERATION_PATH = "/account/shipping_methods/{id}";


	public GetAccountShippingMethodsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingMethodsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingMethod> getResourceType() {
		return ShippingMethod.class;
	}
	
}
