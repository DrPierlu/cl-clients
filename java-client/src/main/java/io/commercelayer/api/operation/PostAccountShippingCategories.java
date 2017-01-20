package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCategory;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingCategories
 */
public class PostAccountShippingCategories extends PostOperation<ShippingCategory> {

	public static final String OPERATION_PATH = "/account/shipping_categories";


	{
		addRequiredField("name");
	}


	public PostAccountShippingCategories() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingCategory> getResourceType() {
		return ShippingCategory.class;
	}
	
}
