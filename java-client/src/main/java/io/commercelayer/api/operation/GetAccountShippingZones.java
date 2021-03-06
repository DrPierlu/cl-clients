package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingZone;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountShippingZones
 */
public class GetAccountShippingZones extends SearchOperation<ShippingZone> {

	public static final String OPERATION_PATH = "/account/shipping_zones";


	public GetAccountShippingZones() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingZone> getResourceType() {
		return ShippingZone.class;
	}
	
}
