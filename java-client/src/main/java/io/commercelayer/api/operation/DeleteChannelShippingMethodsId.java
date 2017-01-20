package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingMethod;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteChannelShippingMethodsId
 */
public class DeleteChannelShippingMethodsId extends DeleteOperation<ShippingMethod> {

	public static final String OPERATION_PATH = "/channel/shipping_methods/{id}";


	public DeleteChannelShippingMethodsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteChannelShippingMethodsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingMethod> getResourceType() {
		return ShippingMethod.class;
	}
	
}
