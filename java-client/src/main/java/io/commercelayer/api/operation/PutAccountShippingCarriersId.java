package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShippingCarriersId
 */
public class PutAccountShippingCarriersId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_carriers/{id}";


	{
		addRequiredField("name");
		addRequiredField("shippingCarrierTypeId");
		addRequiredField("id");
	}


	public PutAccountShippingCarriersId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingCarriersId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
