package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountCurrenciesId
 */
public class PutAccountCurrenciesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/currencies/{id}";


	public PutAccountCurrenciesId() {
		super(OPERATION_PATH);
	}
	
}
