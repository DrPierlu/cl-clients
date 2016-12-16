package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAllCurrencies
 */
public class GetAllCurrencies extends SearchOperation {

	public static final String OPERATION_PATH = "/all/currencies";


	public GetAllCurrencies() {
		super(OPERATION_PATH);
	}
	
}
