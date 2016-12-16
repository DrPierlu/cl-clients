package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;

/**
 * DeleteAccountAddressesId
 */
public class DeleteAccountAddressesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/addresses/{id}";


	public DeleteAccountAddressesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountAddressesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
