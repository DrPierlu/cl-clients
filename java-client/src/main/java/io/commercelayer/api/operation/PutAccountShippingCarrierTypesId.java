package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCarrierType;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShippingCarrierTypesId
 */
public class PutAccountShippingCarrierTypesId extends PutOperation<ShippingCarrierType> {

	public static final String OPERATION_PATH = "/account/shipping_carrier_types/{id}";


	{
		addRequiredField("name");
	}


	public PutAccountShippingCarrierTypesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingCarrierTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingCarrierType> getResourceType() {
		return ShippingCarrierType.class;
	}
	
}
