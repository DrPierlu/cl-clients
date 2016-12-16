package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountShippingCarrierTypes
 */
public class PostAccountShippingCarrierTypes extends PostOperation {

	public static final String OPERATION_PATH = "/account/shipping_carrier_types";


	public PostAccountShippingCarrierTypes() {
		super(OPERATION_PATH);
	}
	
}
