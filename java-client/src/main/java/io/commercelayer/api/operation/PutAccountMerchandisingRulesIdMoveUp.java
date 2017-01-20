package io.commercelayer.api.operation;

import io.commercelayer.api.model.MerchandisingRule;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountMerchandisingRulesIdMoveUp
 */
public class PutAccountMerchandisingRulesIdMoveUp extends MoveOperation {

	public static final String OPERATION_PATH = "/account/merchandising_rules/{id}/move_up";


	public PutAccountMerchandisingRulesIdMoveUp() {
		super(OPERATION_PATH);
	}
	

	public PutAccountMerchandisingRulesIdMoveUp(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return MerchandisingRule.class;
	}
	
}
