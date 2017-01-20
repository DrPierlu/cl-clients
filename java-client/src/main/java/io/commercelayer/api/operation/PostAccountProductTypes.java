package io.commercelayer.api.operation;

import io.commercelayer.api.model.ProductType;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountProductTypes
 */
public class PostAccountProductTypes extends PostOperation<ProductType> {

	public static final String OPERATION_PATH = "/account/product_types";


	{
		addRequiredField("name");
	}


	public PostAccountProductTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<ProductType> getResourceType() {
		return ProductType.class;
	}
	
}
