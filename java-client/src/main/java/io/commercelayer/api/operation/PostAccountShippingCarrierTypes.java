package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCarrierType;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingCarrierTypes
 */
public class PostAccountShippingCarrierTypes extends PostOperation {

	public static final String OPERATION_PATH = "/account/shipping_carrier_types";


	{
		addRequiredField("name");
	}


	public PostAccountShippingCarrierTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingCarrierType.class;
	}
	
}
