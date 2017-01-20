package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaypalAccount;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountPaypalAccounts
 */
public class PostAccountPaypalAccounts extends PostOperation {

	public static final String OPERATION_PATH = "/account/paypal_accounts";


	public PostAccountPaypalAccounts() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PaypalAccount.class;
	}
	
}
