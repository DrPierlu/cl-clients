package io.commercelayer.api.operation;

import io.commercelayer.api.model.MerchandisingRule;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountMerchandisingRulesIdMoveBottom
 */
public class PutAccountMerchandisingRulesIdMoveBottom extends MoveOperation<MerchandisingRule> {

	public static final String OPERATION_PATH = "/account/merchandising_rules/{id}/move_bottom";


	public PutAccountMerchandisingRulesIdMoveBottom() {
		super(OPERATION_PATH);
	}
	

	public PutAccountMerchandisingRulesIdMoveBottom(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MerchandisingRule> getResourceType() {
		return MerchandisingRule.class;
	}
	
}
