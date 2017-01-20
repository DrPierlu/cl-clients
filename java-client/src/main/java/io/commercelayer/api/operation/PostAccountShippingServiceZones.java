package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingServiceZone;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingServiceZones
 */
public class PostAccountShippingServiceZones extends PostOperation<ShippingServiceZone> {

	public static final String OPERATION_PATH = "/account/shipping_service_zones";


	{
		addRequiredField("shippingServiceId");
		addRequiredField("shippingZoneId");
	}


	public PostAccountShippingServiceZones() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingServiceZone> getResourceType() {
		return ShippingServiceZone.class;
	}
	
}
