package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountTransactions
 */
public class GetAccountTransactions extends SearchOperation {

	public static final String OPERATION_PATH = "/account/transactions";


	public GetAccountTransactions() {
		super(OPERATION_PATH);
	}
	
}
