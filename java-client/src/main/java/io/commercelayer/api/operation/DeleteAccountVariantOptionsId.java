package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountVariantOptionsId
 */
public class DeleteAccountVariantOptionsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/variant_options/{id}";


	public DeleteAccountVariantOptionsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountVariantOptionsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
