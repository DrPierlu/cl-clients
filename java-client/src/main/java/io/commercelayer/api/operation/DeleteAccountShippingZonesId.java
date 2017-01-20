package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingZone;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountShippingZonesId
 */
public class DeleteAccountShippingZonesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/shipping_zones/{id}";


	public DeleteAccountShippingZonesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShippingZonesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingZone.class;
	}
	
}
