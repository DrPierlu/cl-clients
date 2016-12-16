package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountTransactions
 */
public class PostAccountTransactions extends PostOperation {

	public static final String OPERATION_PATH = "/account/transactions";


	public PostAccountTransactions() {
		super(OPERATION_PATH);
	}
	
}
