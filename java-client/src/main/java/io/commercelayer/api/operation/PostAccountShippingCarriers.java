package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCarrier;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingCarriers
 */
public class PostAccountShippingCarriers extends PostOperation {

	public static final String OPERATION_PATH = "/account/shipping_carriers";


	{
		addRequiredField("name");
		addRequiredField("shippingCarrierTypeId");
	}


	public PostAccountShippingCarriers() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingCarrier.class;
	}
	
}
