package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountShippingCarriers
 */
public class GetAccountShippingCarriers extends SearchOperation {

	public static final String OPERATION_PATH = "/account/shipping_carriers";


	public GetAccountShippingCarriers() {
		super(OPERATION_PATH);
	}
	
}
