package io.commercelayer.api.operation;

import io.commercelayer.api.model.Product;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetChannelProductsId
 */
public class GetChannelProductsId extends GetIdOperation<Product> {

	public static final String OPERATION_PATH = "/channel/products/{id}";


	public GetChannelProductsId() {
		super(OPERATION_PATH);
	}
	

	public GetChannelProductsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Product> getResourceType() {
		return Product.class;
	}
	
}
