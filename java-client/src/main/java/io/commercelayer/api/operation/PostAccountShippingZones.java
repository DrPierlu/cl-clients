package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountShippingZones
 */
public class PostAccountShippingZones extends PostOperation {

	public static final String OPERATION_PATH = "/account/shipping_zones";


	public PostAccountShippingZones() {
		super(OPERATION_PATH);
	}
	
}
