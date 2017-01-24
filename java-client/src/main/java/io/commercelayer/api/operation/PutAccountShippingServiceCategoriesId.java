package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingServiceCategory;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShippingServiceCategoriesId
 */
public class PutAccountShippingServiceCategoriesId extends PutOperation<ShippingServiceCategory> {

	public static final String OPERATION_PATH = "/account/shipping_service_categories/{id}";


	{
		addRequiredField("shippingServiceId");
		addRequiredField("shippingCategoryId");
	}


	public PutAccountShippingServiceCategoriesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingServiceCategoriesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingServiceCategory> getResourceType() {
		return ShippingServiceCategory.class;
	}
	
}
