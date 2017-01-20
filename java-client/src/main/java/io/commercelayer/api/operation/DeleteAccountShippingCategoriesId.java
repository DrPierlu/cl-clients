package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCategory;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountShippingCategoriesId
 */
public class DeleteAccountShippingCategoriesId extends DeleteOperation<ShippingCategory> {

	public static final String OPERATION_PATH = "/account/shipping_categories/{id}";


	public DeleteAccountShippingCategoriesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShippingCategoriesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingCategory> getResourceType() {
		return ShippingCategory.class;
	}
	
}
