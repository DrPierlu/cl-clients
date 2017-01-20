package io.commercelayer.api.operation;

import io.commercelayer.api.model.Product;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelProducts
 */
public class GetChannelProducts extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/products";


	public GetChannelProducts() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Product.class;
	}
	
}
