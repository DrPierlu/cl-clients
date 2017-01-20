package io.commercelayer.api.operation;

import io.commercelayer.api.model.ProductType;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountProductTypes
 */
public class PostAccountProductTypes extends PostOperation {

	public static final String OPERATION_PATH = "/account/product_types";


	{
		addRequiredField("name");
	}


	public PostAccountProductTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ProductType.class;
	}
	
}
