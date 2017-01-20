package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCarrierType;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingCarrierTypesId
 */
public class GetAccountShippingCarrierTypesId extends GetIdOperation<ShippingCarrierType> {

	public static final String OPERATION_PATH = "/account/shipping_carrier_types/{id}";


	public GetAccountShippingCarrierTypesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingCarrierTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingCarrierType> getResourceType() {
		return ShippingCarrierType.class;
	}
	
}
