package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingMethod;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetChannelShippingMethodsId
 */
public class GetChannelShippingMethodsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/channel/shipping_methods/{id}";


	public GetChannelShippingMethodsId() {
		super(OPERATION_PATH);
	}
	

	public GetChannelShippingMethodsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingMethod.class;
	}
	
}
