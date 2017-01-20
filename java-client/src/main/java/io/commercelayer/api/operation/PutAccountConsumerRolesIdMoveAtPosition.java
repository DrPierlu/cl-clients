package io.commercelayer.api.operation;

import io.commercelayer.api.model.ConsumerRole;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountConsumerRolesIdMoveAtPosition
 */
public class PutAccountConsumerRolesIdMoveAtPosition extends MoveOperation<ConsumerRole> {

	public static final String OPERATION_PATH = "/account/consumer_roles/{id}/move_at/{position}";


	public PutAccountConsumerRolesIdMoveAtPosition() {
		super(OPERATION_PATH);
	}
	

	public PutAccountConsumerRolesIdMoveAtPosition(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ConsumerRole> getResourceType() {
		return ConsumerRole.class;
	}
	
}
