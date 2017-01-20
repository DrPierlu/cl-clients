package io.commercelayer.api.operation;

import io.commercelayer.api.model.Product;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountProducts
 */
public class GetAccountProducts extends SearchOperation<Product> {

	public static final String OPERATION_PATH = "/account/products";


	public GetAccountProducts() {
		super(OPERATION_PATH);
	}
	

	public Class<Product> getResourceType() {
		return Product.class;
	}
	
}
