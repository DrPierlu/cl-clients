package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountCreditCards
 */
public class GetAccountCreditCards extends SearchOperation {

	public static final String OPERATION_PATH = "/account/credit_cards";


	public GetAccountCreditCards() {
		super(OPERATION_PATH);
	}
	
}
