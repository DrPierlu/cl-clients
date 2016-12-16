package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShippingZonesId
 */
public class PutAccountShippingZonesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_zones/{id}";


	public PutAccountShippingZonesId() {
		super(OPERATION_PATH);
	}
	
}
