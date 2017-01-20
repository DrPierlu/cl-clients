package io.commercelayer.api.operation;

import io.commercelayer.api.model.Transaction;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountTransactionsId
 */
public class GetAccountTransactionsId extends GetIdOperation<Transaction> {

	public static final String OPERATION_PATH = "/account/transactions/{id}";


	public GetAccountTransactionsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountTransactionsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Transaction> getResourceType() {
		return Transaction.class;
	}
	
}
