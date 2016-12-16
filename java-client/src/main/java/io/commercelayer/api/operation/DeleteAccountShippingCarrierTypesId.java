package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;

/**
 * DeleteAccountShippingCarrierTypesId
 */
public class DeleteAccountShippingCarrierTypesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/shipping_carrier_types/{id}";


	public DeleteAccountShippingCarrierTypesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShippingCarrierTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
