package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaypalAccount;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostCallbacksPaypalAccountsPaypalAccountToken
 */
public class PostCallbacksPaypalAccountsPaypalAccountToken extends PostOperation<PaypalAccount> {

	public static final String OPERATION_PATH = "/callbacks/paypal_accounts/{paypal_account_token}";


	{
		
	}


	public PostCallbacksPaypalAccountsPaypalAccountToken() {
		super(OPERATION_PATH);
	}
	

	public void setPaypalAccountToken(Object paypalAccountToken) {
		addPathParam("paypal_account_token", paypalAccountToken);
	}
	

	public Object getPaypalAccountToken() {
		return getPathParam("paypal_account_token");
	}
	

	public Class<PaypalAccount> getResourceType() {
		return PaypalAccount.class;
	}
	
}
