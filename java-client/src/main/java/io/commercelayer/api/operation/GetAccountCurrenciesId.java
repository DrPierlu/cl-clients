package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;

/**
 * GetAccountCurrenciesId
 */
public class GetAccountCurrenciesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/currencies/{id}";


	public GetAccountCurrenciesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountCurrenciesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
