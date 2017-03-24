package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingService;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingServices
 */
public class PostAccountShippingServices extends PostOperation<ShippingService> {

	public static final String OPERATION_PATH = "/account/shipping_services";


	{
		addRequiredField("name");
		addRequiredField("kind");
		addRequiredField("shippingCarrierAccountId");
	}


	public PostAccountShippingServices() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingService> getResourceType() {
		return ShippingService.class;
	}
	
}
