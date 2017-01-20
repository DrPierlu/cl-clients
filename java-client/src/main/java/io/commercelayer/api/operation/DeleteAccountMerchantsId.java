package io.commercelayer.api.operation;

import io.commercelayer.api.model.Merchant;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountMerchantsId
 */
public class DeleteAccountMerchantsId extends DeleteOperation<Merchant> {

	public static final String OPERATION_PATH = "/account/merchants/{id}";


	public DeleteAccountMerchantsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountMerchantsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Merchant> getResourceType() {
		return Merchant.class;
	}
	
}
