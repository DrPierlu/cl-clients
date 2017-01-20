package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaypalAccount;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountPaypalAccountsId
 */
public class GetAccountPaypalAccountsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/paypal_accounts/{id}";


	public GetAccountPaypalAccountsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountPaypalAccountsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PaypalAccount.class;
	}
	
}
