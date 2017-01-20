package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingServiceCategory;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountShippingServiceCategoriesId
 */
public class DeleteAccountShippingServiceCategoriesId extends DeleteOperation<ShippingServiceCategory> {

	public static final String OPERATION_PATH = "/account/shipping_service_categories/{id}";


	public DeleteAccountShippingServiceCategoriesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShippingServiceCategoriesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingServiceCategory> getResourceType() {
		return ShippingServiceCategory.class;
	}
	
}
