package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCarrier;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingCarriers
 */
public class PostAccountShippingCarriers extends PostOperation<ShippingCarrier> {

	public static final String OPERATION_PATH = "/account/shipping_carriers";


	{
		addRequiredField("kind");
	}


	public PostAccountShippingCarriers() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingCarrier> getResourceType() {
		return ShippingCarrier.class;
	}
	
}
