package io.commercelayer.api.operation;

import io.commercelayer.api.model.Transaction;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountTransactions
 */
public class GetAccountTransactions extends SearchOperation<Transaction> {

	public static final String OPERATION_PATH = "/account/transactions";


	public GetAccountTransactions() {
		super(OPERATION_PATH);
	}
	

	public Class<Transaction> getResourceType() {
		return Transaction.class;
	}
	
}
