package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;

/**
 * DeleteAccountProductTypesId
 */
public class DeleteAccountProductTypesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/product_types/{id}";


	public DeleteAccountProductTypesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountProductTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
