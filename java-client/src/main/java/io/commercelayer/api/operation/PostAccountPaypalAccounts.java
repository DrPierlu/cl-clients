package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaypalAccount;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountPaypalAccounts
 */
public class PostAccountPaypalAccounts extends PostOperation<PaypalAccount> {

	public static final String OPERATION_PATH = "/account/paypal_accounts";


	public PostAccountPaypalAccounts() {
		super(OPERATION_PATH);
	}
	

	public Class<PaypalAccount> getResourceType() {
		return PaypalAccount.class;
	}
	
}
