package io.commercelayer.api.operation;

import io.commercelayer.api.model.Transaction;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountTransactionsId
 */
public class PutAccountTransactionsId extends PutOperation<Transaction> {

	public static final String OPERATION_PATH = "/account/transactions/{id}";


	{
		
	}


	public PutAccountTransactionsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountTransactionsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Transaction> getResourceType() {
		return Transaction.class;
	}
	
}
