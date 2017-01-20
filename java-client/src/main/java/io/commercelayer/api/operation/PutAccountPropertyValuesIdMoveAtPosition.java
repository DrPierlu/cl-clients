package io.commercelayer.api.operation;

import io.commercelayer.api.model.PropertyValue;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountPropertyValuesIdMoveAtPosition
 */
public class PutAccountPropertyValuesIdMoveAtPosition extends MoveOperation {

	public static final String OPERATION_PATH = "/account/property_values/{id}/move_at/{position}";


	public PutAccountPropertyValuesIdMoveAtPosition() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPropertyValuesIdMoveAtPosition(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PropertyValue.class;
	}
	
}
