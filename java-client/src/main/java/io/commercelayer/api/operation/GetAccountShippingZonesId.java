package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingZonesId
 */
public class GetAccountShippingZonesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/shipping_zones/{id}";


	public GetAccountShippingZonesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingZonesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
