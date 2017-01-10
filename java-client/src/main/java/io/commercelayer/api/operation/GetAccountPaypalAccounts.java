package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountPaypalAccounts
 */
public class GetAccountPaypalAccounts extends SearchOperation {

	public static final String OPERATION_PATH = "/account/paypal_accounts";


	public GetAccountPaypalAccounts() {
		super(OPERATION_PATH);
	}
	
}
