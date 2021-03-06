package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingServiceZone;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountShippingServiceZonesId
 */
public class DeleteAccountShippingServiceZonesId extends DeleteOperation<ShippingServiceZone> {

	public static final String OPERATION_PATH = "/account/shipping_service_zones/{id}";


	public DeleteAccountShippingServiceZonesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShippingServiceZonesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingServiceZone> getResourceType() {
		return ShippingServiceZone.class;
	}
	
}
