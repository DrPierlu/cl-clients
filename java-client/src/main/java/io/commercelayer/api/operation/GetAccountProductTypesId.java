package io.commercelayer.api.operation;

import io.commercelayer.api.model.ProductType;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountProductTypesId
 */
public class GetAccountProductTypesId extends GetIdOperation<ProductType> {

	public static final String OPERATION_PATH = "/account/product_types/{id}";


	public GetAccountProductTypesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountProductTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ProductType> getResourceType() {
		return ProductType.class;
	}
	
}
