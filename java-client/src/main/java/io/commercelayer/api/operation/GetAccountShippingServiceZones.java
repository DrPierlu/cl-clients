package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingServiceZone;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountShippingServiceZones
 */
public class GetAccountShippingServiceZones extends SearchOperation {

	public static final String OPERATION_PATH = "/account/shipping_service_zones";


	public GetAccountShippingServiceZones() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingServiceZone.class;
	}
	
}
