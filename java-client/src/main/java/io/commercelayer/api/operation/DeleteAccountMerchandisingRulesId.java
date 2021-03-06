package io.commercelayer.api.operation;

import io.commercelayer.api.model.MerchandisingRule;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountMerchandisingRulesId
 */
public class DeleteAccountMerchandisingRulesId extends DeleteOperation<MerchandisingRule> {

	public static final String OPERATION_PATH = "/account/merchandising_rules/{id}";


	public DeleteAccountMerchandisingRulesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountMerchandisingRulesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MerchandisingRule> getResourceType() {
		return MerchandisingRule.class;
	}
	
}
