package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountMerchantsId
 */
public class DeleteAccountMerchantsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/merchants/{id}";


	public DeleteAccountMerchantsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountMerchantsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
