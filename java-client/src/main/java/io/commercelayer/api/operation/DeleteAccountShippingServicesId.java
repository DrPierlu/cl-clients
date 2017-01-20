package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingService;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountShippingServicesId
 */
public class DeleteAccountShippingServicesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/shipping_services/{id}";


	public DeleteAccountShippingServicesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShippingServicesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingService.class;
	}
	
}
