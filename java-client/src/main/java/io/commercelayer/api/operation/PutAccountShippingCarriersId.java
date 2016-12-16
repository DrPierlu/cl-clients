package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShippingCarriersId
 */
public class PutAccountShippingCarriersId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_carriers/{id}";


	public PutAccountShippingCarriersId() {
		super(OPERATION_PATH);
	}
	
}
