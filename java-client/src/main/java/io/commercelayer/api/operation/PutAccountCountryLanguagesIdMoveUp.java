package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;

/**
 * PutAccountCountryLanguagesIdMoveUp
 */
public class PutAccountCountryLanguagesIdMoveUp extends MoveOperation {

	public static final String OPERATION_PATH = "/account/country_languages/{id}/move_up";


	public PutAccountCountryLanguagesIdMoveUp() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCountryLanguagesIdMoveUp(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
