package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountTransactionsId
 */
public class PutAccountTransactionsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/transactions/{id}";


	public PutAccountTransactionsId() {
		super(OPERATION_PATH);
	}
	
}
