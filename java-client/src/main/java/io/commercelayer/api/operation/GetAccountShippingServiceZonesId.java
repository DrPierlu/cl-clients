package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingServiceZone;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingServiceZonesId
 */
public class GetAccountShippingServiceZonesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/shipping_service_zones/{id}";


	public GetAccountShippingServiceZonesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingServiceZonesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingServiceZone.class;
	}
	
}
