package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingService;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountShippingServices
 */
public class GetAccountShippingServices extends SearchOperation<ShippingService> {

	public static final String OPERATION_PATH = "/account/shipping_services";


	public GetAccountShippingServices() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingService> getResourceType() {
		return ShippingService.class;
	}
	
}
