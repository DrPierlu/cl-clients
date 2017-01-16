package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountMerchandisingRulesIdMoveTop
 */
public class PutAccountMerchandisingRulesIdMoveTop extends MoveOperation {

	public static final String OPERATION_PATH = "/account/merchandising_rules/{id}/move_top";


	public PutAccountMerchandisingRulesIdMoveTop() {
		super(OPERATION_PATH);
	}
	

	public PutAccountMerchandisingRulesIdMoveTop(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
