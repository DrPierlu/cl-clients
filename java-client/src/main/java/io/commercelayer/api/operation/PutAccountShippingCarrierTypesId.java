package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShippingCarrierTypesId
 */
public class PutAccountShippingCarrierTypesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_carrier_types/{id}";


	{
		addRequiredField("name");
		addRequiredField("id");
	}


	public PutAccountShippingCarrierTypesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingCarrierTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
