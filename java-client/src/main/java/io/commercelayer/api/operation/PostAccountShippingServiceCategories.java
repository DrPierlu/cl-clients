package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingServiceCategories
 */
public class PostAccountShippingServiceCategories extends PostOperation {

	public static final String OPERATION_PATH = "/account/shipping_service_categories";


	{
		addRequiredField("shippingServiceId");
		addRequiredField("shippingCategoryId");
	}


	public PostAccountShippingServiceCategories() {
		super(OPERATION_PATH);
	}
	
}
