package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingServiceCategory;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingServiceCategoriesId
 */
public class GetAccountShippingServiceCategoriesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/shipping_service_categories/{id}";


	public GetAccountShippingServiceCategoriesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingServiceCategoriesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingServiceCategory.class;
	}
	
}
