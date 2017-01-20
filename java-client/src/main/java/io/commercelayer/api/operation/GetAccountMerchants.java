package io.commercelayer.api.operation;

import io.commercelayer.api.model.Merchant;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountMerchants
 */
public class GetAccountMerchants extends SearchOperation {

	public static final String OPERATION_PATH = "/account/merchants";


	public GetAccountMerchants() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Merchant.class;
	}
	
}
