package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShippingMethodsId
 */
public class PutAccountShippingMethodsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_methods/{id}";


	{
		addRequiredField("orderId");
		addRequiredField("shippingServiceId");
		addRequiredField("shippingAddressId");
		addRequiredField("shippingPackageId");
		addRequiredField("orderDefault");
		addRequiredField("lineItemDefaultId");
		addRequiredField("id");
	}

	public PutAccountShippingMethodsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingMethodsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
