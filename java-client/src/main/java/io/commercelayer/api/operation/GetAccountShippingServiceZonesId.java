package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingServiceZone;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingServiceZonesId
 */
public class GetAccountShippingServiceZonesId extends GetIdOperation<ShippingServiceZone> {

	public static final String OPERATION_PATH = "/account/shipping_service_zones/{id}";


	public GetAccountShippingServiceZonesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingServiceZonesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingServiceZone> getResourceType() {
		return ShippingServiceZone.class;
	}
	
}
