package io.commercelayer.api.operation;

import io.commercelayer.api.model.Transaction;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountTransactionsId
 */
public class GetAccountTransactionsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/transactions/{id}";


	public GetAccountTransactionsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountTransactionsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Transaction.class;
	}
	
}
