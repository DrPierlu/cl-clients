package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShippingMethodsId
 */
public class PutAccountShippingMethodsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_methods/{id}";


	public PutAccountShippingMethodsId() {
		super(OPERATION_PATH);
	}
	
}
