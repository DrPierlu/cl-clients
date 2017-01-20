package io.commercelayer.api.operation;

import io.commercelayer.api.model.Merchant;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountMerchantsId
 */
public class GetAccountMerchantsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/merchants/{id}";


	public GetAccountMerchantsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountMerchantsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Merchant.class;
	}
	
}
