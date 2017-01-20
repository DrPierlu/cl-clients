package io.commercelayer.api.operation;

import io.commercelayer.api.model.ConsumerRole;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountConsumerRolesIdMoveTop
 */
public class PutAccountConsumerRolesIdMoveTop extends MoveOperation<ConsumerRole> {

	public static final String OPERATION_PATH = "/account/consumer_roles/{id}/move_top";


	public PutAccountConsumerRolesIdMoveTop() {
		super(OPERATION_PATH);
	}
	

	public PutAccountConsumerRolesIdMoveTop(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ConsumerRole> getResourceType() {
		return ConsumerRole.class;
	}
	
}
