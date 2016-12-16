package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;

/**
 * DeleteAccountVariantsId
 */
public class DeleteAccountVariantsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/variants/{id}";


	public DeleteAccountVariantsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountVariantsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
