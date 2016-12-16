package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShippingCarrierTypesId
 */
public class PutAccountShippingCarrierTypesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_carrier_types/{id}";


	public PutAccountShippingCarrierTypesId() {
		super(OPERATION_PATH);
	}
	
}
