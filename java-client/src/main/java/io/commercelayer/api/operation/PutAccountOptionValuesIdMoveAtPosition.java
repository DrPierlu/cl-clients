package io.commercelayer.api.operation;

import io.commercelayer.api.model.OptionValue;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountOptionValuesIdMoveAtPosition
 */
public class PutAccountOptionValuesIdMoveAtPosition extends MoveOperation {

	public static final String OPERATION_PATH = "/account/option_values/{id}/move_at/{position}";


	public PutAccountOptionValuesIdMoveAtPosition() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOptionValuesIdMoveAtPosition(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return OptionValue.class;
	}
	
}
