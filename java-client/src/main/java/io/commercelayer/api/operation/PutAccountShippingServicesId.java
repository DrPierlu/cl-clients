package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShippingServicesId
 */
public class PutAccountShippingServicesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_services/{id}";


	{
		addRequiredField("name");
		addRequiredField("shippingCarrierId");
		addRequiredField("id");
	}


	public PutAccountShippingServicesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingServicesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
