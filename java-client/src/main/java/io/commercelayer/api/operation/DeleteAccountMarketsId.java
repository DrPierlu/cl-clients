package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;

/**
 * DeleteAccountMarketsId
 */
public class DeleteAccountMarketsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/markets/{id}";


	public DeleteAccountMarketsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountMarketsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
