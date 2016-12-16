package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShippingServicesId
 */
public class PutAccountShippingServicesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_services/{id}";


	public PutAccountShippingServicesId() {
		super(OPERATION_PATH);
	}
	
}
