package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountProductsId
 */
public class PutAccountProductsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/products/{id}";


	public PutAccountProductsId() {
		super(OPERATION_PATH);
	}
	
}
