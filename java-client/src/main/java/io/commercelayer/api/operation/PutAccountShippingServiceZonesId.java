package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingServiceZone;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShippingServiceZonesId
 */
public class PutAccountShippingServiceZonesId extends PutOperation<ShippingServiceZone> {

	public static final String OPERATION_PATH = "/account/shipping_service_zones/{id}";


	{
		addRequiredField("shippingServiceId");
		addRequiredField("shippingZoneId");
		addRequiredField("id");
	}


	public PutAccountShippingServiceZonesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingServiceZonesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingServiceZone> getResourceType() {
		return ShippingServiceZone.class;
	}
	
}
