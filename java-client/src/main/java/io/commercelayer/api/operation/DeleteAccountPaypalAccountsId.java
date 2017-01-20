package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaypalAccount;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountPaypalAccountsId
 */
public class DeleteAccountPaypalAccountsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/paypal_accounts/{id}";


	public DeleteAccountPaypalAccountsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountPaypalAccountsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PaypalAccount.class;
	}
	
}
