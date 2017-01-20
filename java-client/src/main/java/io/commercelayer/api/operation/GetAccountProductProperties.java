package io.commercelayer.api.operation;

import io.commercelayer.api.model.ProductProperty;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountProductProperties
 */
public class GetAccountProductProperties extends SearchOperation {

	public static final String OPERATION_PATH = "/account/product_properties";


	public GetAccountProductProperties() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ProductProperty.class;
	}
	
}
