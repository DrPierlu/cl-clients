package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingServiceCategory;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingServiceCategories
 */
public class PostAccountShippingServiceCategories extends PostOperation<ShippingServiceCategory> {

	public static final String OPERATION_PATH = "/account/shipping_service_categories";


	{
		addRequiredField("shippingServiceId");
		addRequiredField("shippingCategoryId");
	}


	public PostAccountShippingServiceCategories() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingServiceCategory> getResourceType() {
		return ShippingServiceCategory.class;
	}
	
}
