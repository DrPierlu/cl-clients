package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountCreditCards
 */
public class PostAccountCreditCards extends PostOperation {

	public static final String OPERATION_PATH = "/account/credit_cards";


	public PostAccountCreditCards() {
		super(OPERATION_PATH);
	}
	
}
