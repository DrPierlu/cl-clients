package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCarrier;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShippingCarriersId
 */
public class PutAccountShippingCarriersId extends PutOperation<ShippingCarrier> {

	public static final String OPERATION_PATH = "/account/shipping_carriers/{id}";


	{
		addRequiredField("kind");
	}


	public PutAccountShippingCarriersId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingCarriersId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingCarrier> getResourceType() {
		return ShippingCarrier.class;
	}
	
}
