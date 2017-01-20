package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCarrierType;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountShippingCarrierTypes
 */
public class GetAccountShippingCarrierTypes extends SearchOperation {

	public static final String OPERATION_PATH = "/account/shipping_carrier_types";


	public GetAccountShippingCarrierTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingCarrierType.class;
	}
	
}
