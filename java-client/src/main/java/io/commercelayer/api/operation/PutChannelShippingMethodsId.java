package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutChannelShippingMethodsId
 */
public class PutChannelShippingMethodsId extends PutOperation {

	public static final String OPERATION_PATH = "/channel/shipping_methods/{id}";


	public PutChannelShippingMethodsId() {
		super(OPERATION_PATH);
	}
	
}
