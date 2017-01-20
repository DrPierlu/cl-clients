package io.commercelayer.api.operation;

import io.commercelayer.api.model.Product;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountProductsId
 */
public class GetAccountProductsId extends GetIdOperation<Product> {

	public static final String OPERATION_PATH = "/account/products/{id}";


	public GetAccountProductsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountProductsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Product> getResourceType() {
		return Product.class;
	}
	
}
