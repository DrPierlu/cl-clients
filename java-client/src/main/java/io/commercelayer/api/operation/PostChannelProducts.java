package io.commercelayer.api.operation;

import io.commercelayer.api.model.Product;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostChannelProducts
 */
public class PostChannelProducts extends PostOperation<Product> {

	public static final String OPERATION_PATH = "/channel/products";


	public PostChannelProducts() {
		super(OPERATION_PATH);
	}
	

	public Class<Product> getResourceType() {
		return Product.class;
	}
	
}
