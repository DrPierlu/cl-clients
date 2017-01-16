package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountMerchandisingRulesId
 */
public class DeleteAccountMerchandisingRulesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/merchandising_rules/{id}";


	public DeleteAccountMerchandisingRulesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountMerchandisingRulesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
