package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountTransactionsTransactionTokenCapture
 */
public class PutAccountTransactionsTransactionTokenCapture extends PutOperation {

	public static final String OPERATION_PATH = "/account/transactions/{transaction_token}/capture";


	{
		
	}


	public PutAccountTransactionsTransactionTokenCapture() {
		super(OPERATION_PATH);
	}
	

	public PutAccountTransactionsTransactionTokenCapture(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public void setTransactionToken(Object transactionToken) {
		addPathParam("transaction_token", transactionToken);
	}
	

	public Object getTransactionToken() {
		return getPathParam("transaction_token");
	}
	
}
