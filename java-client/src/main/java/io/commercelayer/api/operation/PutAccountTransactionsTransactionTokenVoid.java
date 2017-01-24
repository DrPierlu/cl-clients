package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountTransactionsTransactionTokenVoid
 */
public class PutAccountTransactionsTransactionTokenVoid extends PutOperation {

	public static final String OPERATION_PATH = "/account/transactions/{transaction_token}/void";


	{
		
	}


	public PutAccountTransactionsTransactionTokenVoid() {
		super(OPERATION_PATH);
	}
	

	public PutAccountTransactionsTransactionTokenVoid(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public void setTransactionToken(Object transactionToken) {
		addPathParam("transaction_token", transactionToken);
	}
	

	public Object getTransactionToken() {
		return getPathParam("transaction_token");
	}
	
}
