package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountShippingCarriersId
 */
public class DeleteAccountShippingCarriersId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/shipping_carriers/{id}";


	public DeleteAccountShippingCarriersId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShippingCarriersId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
