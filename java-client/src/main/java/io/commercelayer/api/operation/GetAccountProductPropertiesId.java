package io.commercelayer.api.operation;

import io.commercelayer.api.model.ProductProperty;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountProductPropertiesId
 */
public class GetAccountProductPropertiesId extends GetIdOperation<ProductProperty> {

	public static final String OPERATION_PATH = "/account/product_properties/{id}";


	public GetAccountProductPropertiesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountProductPropertiesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ProductProperty> getResourceType() {
		return ProductProperty.class;
	}
	
}
