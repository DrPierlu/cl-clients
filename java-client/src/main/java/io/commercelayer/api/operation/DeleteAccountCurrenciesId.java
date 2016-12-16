package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;

/**
 * DeleteAccountCurrenciesId
 */
public class DeleteAccountCurrenciesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/currencies/{id}";


	public DeleteAccountCurrenciesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountCurrenciesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
