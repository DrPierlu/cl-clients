package io.commercelayer.api.operation;

import io.commercelayer.api.model.MerchandisingRule;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountMerchandisingRulesIdMoveDown
 */
public class PutAccountMerchandisingRulesIdMoveDown extends MoveOperation<MerchandisingRule> {

	public static final String OPERATION_PATH = "/account/merchandising_rules/{id}/move_down";


	public PutAccountMerchandisingRulesIdMoveDown() {
		super(OPERATION_PATH);
	}
	

	public PutAccountMerchandisingRulesIdMoveDown(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MerchandisingRule> getResourceType() {
		return MerchandisingRule.class;
	}
	
}
