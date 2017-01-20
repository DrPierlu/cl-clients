package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCategory;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShippingCategoriesId
 */
public class PutAccountShippingCategoriesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_categories/{id}";


	{
		addRequiredField("name");
		addRequiredField("id");
	}


	public PutAccountShippingCategoriesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingCategoriesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingCategory.class;
	}
	
}
