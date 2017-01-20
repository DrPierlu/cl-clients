package io.commercelayer.api.operation;

import io.commercelayer.api.model.Transaction;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelTransactionsTransactionToken
 */
public class GetChannelTransactionsTransactionToken extends SearchOperation<Transaction> {

	public static final String OPERATION_PATH = "/channel/transactions/{transaction_token}";


	public GetChannelTransactionsTransactionToken() {
		super(OPERATION_PATH);
	}
	

	public void setTransactionToken(Object transactionToken) {
		addPathParam("transaction_token", transactionToken);
	}
	

	public Object getTransactionToken() {
		return getPathParam("transaction_token");
	}
	

	public Class<Transaction> getResourceType() {
		return Transaction.class;
	}
	
}
