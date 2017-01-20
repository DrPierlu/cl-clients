package io.commercelayer.api.operation;

import io.commercelayer.api.model.ProductProperty;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountProductPropertiesId
 */
public class DeleteAccountProductPropertiesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/product_properties/{id}";


	public DeleteAccountProductPropertiesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountProductPropertiesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ProductProperty.class;
	}
	
}
