package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingZone;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingZonesId
 */
public class GetAccountShippingZonesId extends GetIdOperation<ShippingZone> {

	public static final String OPERATION_PATH = "/account/shipping_zones/{id}";


	public GetAccountShippingZonesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingZonesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingZone> getResourceType() {
		return ShippingZone.class;
	}
	
}
