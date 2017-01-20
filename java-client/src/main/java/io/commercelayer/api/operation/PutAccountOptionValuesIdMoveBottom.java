package io.commercelayer.api.operation;

import io.commercelayer.api.model.OptionValue;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountOptionValuesIdMoveBottom
 */
public class PutAccountOptionValuesIdMoveBottom extends MoveOperation<OptionValue> {

	public static final String OPERATION_PATH = "/account/option_values/{id}/move_bottom";


	public PutAccountOptionValuesIdMoveBottom() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOptionValuesIdMoveBottom(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<OptionValue> getResourceType() {
		return OptionValue.class;
	}
	
}
