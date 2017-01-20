package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingService;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingServicesId
 */
public class GetAccountShippingServicesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/shipping_services/{id}";


	public GetAccountShippingServicesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingServicesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingService.class;
	}
	
}
