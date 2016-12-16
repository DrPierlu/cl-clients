package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;

/**
 * PutAccountCountryLanguagesIdMoveAtPosition
 */
public class PutAccountCountryLanguagesIdMoveAtPosition extends MoveOperation {

	public static final String OPERATION_PATH = "/account/country_languages/{id}/move_at/{position}";


	public PutAccountCountryLanguagesIdMoveAtPosition() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCountryLanguagesIdMoveAtPosition(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
