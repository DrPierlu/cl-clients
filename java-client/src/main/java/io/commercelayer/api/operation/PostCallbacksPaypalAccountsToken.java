package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaypalAccount;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostCallbacksPaypalAccountsToken
 */
public class PostCallbacksPaypalAccountsToken extends PostOperation<PaypalAccount> {

	public static final String OPERATION_PATH = "/callbacks/paypal_accounts/{token}";


	{
		
	}


	public PostCallbacksPaypalAccountsToken() {
		super(OPERATION_PATH);
	}
	

	public void setToken(Object token) {
		addPathParam("token", token);
	}
	

	public Object getToken() {
		return getPathParam("token");
	}
	

	public Class<PaypalAccount> getResourceType() {
		return PaypalAccount.class;
	}
	
}
