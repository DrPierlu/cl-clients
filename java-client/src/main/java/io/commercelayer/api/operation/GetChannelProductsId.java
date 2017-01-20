package io.commercelayer.api.operation;

import io.commercelayer.api.model.Product;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetChannelProductsId
 */
public class GetChannelProductsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/channel/products/{id}";


	public GetChannelProductsId() {
		super(OPERATION_PATH);
	}
	

	public GetChannelProductsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Product.class;
	}
	
}
