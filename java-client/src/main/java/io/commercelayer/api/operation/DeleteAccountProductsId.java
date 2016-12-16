package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;

/**
 * DeleteAccountProductsId
 */
public class DeleteAccountProductsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/products/{id}";


	public DeleteAccountProductsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountProductsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
