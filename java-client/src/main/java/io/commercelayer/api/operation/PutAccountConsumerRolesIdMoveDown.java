package io.commercelayer.api.operation;

import io.commercelayer.api.model.ConsumerRole;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountConsumerRolesIdMoveDown
 */
public class PutAccountConsumerRolesIdMoveDown extends MoveOperation<ConsumerRole> {

	public static final String OPERATION_PATH = "/account/consumer_roles/{id}/move_down";


	public PutAccountConsumerRolesIdMoveDown() {
		super(OPERATION_PATH);
	}
	

	public PutAccountConsumerRolesIdMoveDown(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ConsumerRole> getResourceType() {
		return ConsumerRole.class;
	}
	
}
