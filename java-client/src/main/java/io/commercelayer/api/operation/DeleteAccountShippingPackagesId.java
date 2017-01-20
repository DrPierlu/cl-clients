package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingPackage;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountShippingPackagesId
 */
public class DeleteAccountShippingPackagesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/shipping_packages/{id}";


	public DeleteAccountShippingPackagesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShippingPackagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingPackage.class;
	}
	
}
