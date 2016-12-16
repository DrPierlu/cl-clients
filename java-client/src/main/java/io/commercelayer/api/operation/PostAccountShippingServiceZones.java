package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountShippingServiceZones
 */
public class PostAccountShippingServiceZones extends PostOperation {

	public static final String OPERATION_PATH = "/account/shipping_service_zones";


	public PostAccountShippingServiceZones() {
		super(OPERATION_PATH);
	}
	
}
