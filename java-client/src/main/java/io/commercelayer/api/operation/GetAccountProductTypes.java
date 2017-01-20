package io.commercelayer.api.operation;

import io.commercelayer.api.model.ProductType;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountProductTypes
 */
public class GetAccountProductTypes extends SearchOperation<ProductType> {

	public static final String OPERATION_PATH = "/account/product_types";


	public GetAccountProductTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<ProductType> getResourceType() {
		return ProductType.class;
	}
	
}
