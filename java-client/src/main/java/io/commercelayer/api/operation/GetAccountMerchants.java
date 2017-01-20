package io.commercelayer.api.operation;

import io.commercelayer.api.model.Merchant;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountMerchants
 */
public class GetAccountMerchants extends SearchOperation<Merchant> {

	public static final String OPERATION_PATH = "/account/merchants";


	public GetAccountMerchants() {
		super(OPERATION_PATH);
	}
	

	public Class<Merchant> getResourceType() {
		return Merchant.class;
	}
	
}
