package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;

/**
 * PutAccountMerchandisingRulesIdMoveAtPosition
 */
public class PutAccountMerchandisingRulesIdMoveAtPosition extends MoveOperation {

	public static final String OPERATION_PATH = "/account/merchandising_rules/{id}/move_at/{position}";


	public PutAccountMerchandisingRulesIdMoveAtPosition() {
		super(OPERATION_PATH);
	}
	

	public PutAccountMerchandisingRulesIdMoveAtPosition(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
