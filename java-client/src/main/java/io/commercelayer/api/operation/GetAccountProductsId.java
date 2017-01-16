package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountProductsId
 */
public class GetAccountProductsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/products/{id}";


	public GetAccountProductsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountProductsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
