package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCategory;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountShippingCategories
 */
public class GetAccountShippingCategories extends SearchOperation {

	public static final String OPERATION_PATH = "/account/shipping_categories";


	public GetAccountShippingCategories() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingCategory.class;
	}
	
}
