package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountCreditCardsId
 */
public class GetAccountCreditCardsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/credit_cards/{id}";


	public GetAccountCreditCardsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountCreditCardsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
