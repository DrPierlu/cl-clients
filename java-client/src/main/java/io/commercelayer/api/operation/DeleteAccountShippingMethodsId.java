package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingMethod;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountShippingMethodsId
 */
public class DeleteAccountShippingMethodsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/shipping_methods/{id}";


	public DeleteAccountShippingMethodsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShippingMethodsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingMethod.class;
	}
	
}
