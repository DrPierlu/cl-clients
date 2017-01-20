package io.commercelayer.api.operation;

import io.commercelayer.api.model.Product;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostChannelProducts
 */
public class PostChannelProducts extends PostOperation {

	public static final String OPERATION_PATH = "/channel/products";


	public PostChannelProducts() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Product.class;
	}
	
}
