package io.commercelayer.api.operation;

import io.commercelayer.api.model.ProductProperty;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelProductProperties
 */
public class GetChannelProductProperties extends SearchOperation<ProductProperty> {

	public static final String OPERATION_PATH = "/channel/product_properties";


	public GetChannelProductProperties() {
		super(OPERATION_PATH);
	}
	

	public Class<ProductProperty> getResourceType() {
		return ProductProperty.class;
	}
	
}
