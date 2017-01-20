package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCarrier;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingCarriersId
 */
public class GetAccountShippingCarriersId extends GetIdOperation<ShippingCarrier> {

	public static final String OPERATION_PATH = "/account/shipping_carriers/{id}";


	public GetAccountShippingCarriersId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingCarriersId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingCarrier> getResourceType() {
		return ShippingCarrier.class;
	}
	
}
