package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountCurrencies
 */
public class GetAccountCurrencies extends SearchOperation {

	public static final String OPERATION_PATH = "/account/currencies";


	public GetAccountCurrencies() {
		super(OPERATION_PATH);
	}
	
}
