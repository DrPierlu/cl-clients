package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaypalAccount;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountPaypalAccountsId
 */
public class PutAccountPaypalAccountsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/paypal_accounts/{id}";


	{
		addRequiredField("id");
	}


	public PutAccountPaypalAccountsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPaypalAccountsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PaypalAccount.class;
	}
	
}
